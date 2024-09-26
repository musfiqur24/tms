package com.example.demo.teacher;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/teacher")

public class TeacherInfoRestController {

    private final TeacherInfoService teacherInfoService;

    public TeacherInfoRestController(TeacherInfoService teacherInfoService) {
        this.teacherInfoService = teacherInfoService;
    }

    @PostMapping
    public String doSave(@RequestBody TeacherInfoDto dto) {
        try {
            teacherInfoService.saveTeacher(dto);
        } catch (Exception e) {
            return "Internal Server Error" + e;
        }
        return "Return save successfully";
    }

    @GetMapping
    public List<TeacherInfoDto> findAll() {
        try {
            return teacherInfoService.findAll();
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }
    public ResponseEntity<Long> getTeacherCount(){
        try {
            long teacherCount = teacherInfoService.countTeachers();
            return ResponseEntity.ok(teacherCount);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(0L);
        }
    }

    @PutMapping("/{teacherId}")
    public String updateTeacher(@PathVariable String teacherId, @RequestBody TeacherInfoDto dto) {
        try {
            return teacherInfoService.updateTeacherInfo(teacherId, dto);
        } catch (Exception e) {
            return "Update Failed";
        }
    }
@DeleteMapping("/{teacherId}")
    public String deleteTeacher (@PathVariable String teacherId){
        try{
            teacherInfoService.deleteTeacher(teacherId);
            return "Teacher  Deleted Successfully";
        } catch (Exception e){
            return "Delete Failed";
        }
}



}
