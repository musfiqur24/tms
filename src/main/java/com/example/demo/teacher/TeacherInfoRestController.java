package com.example.demo.teacher;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/teacher")

public class TeacherInfoRestController {

    private final TeacherInfoService teacherInfoService;

    public TeacherInfoRestController(TeacherInfoService teacherInfoService) {
        this.teacherInfoService = teacherInfoService;
    }

    @PostMapping
    public ResponseEntity<String> doSave(@RequestBody @Valid TeacherInfoDto dto) {
        try {
            teacherInfoService.saveTeacher(dto);
            
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal Server Error");
        }
        return ResponseEntity.ok("Return save successfully");
    }

    @GetMapping
    public List<TeacherInfoDto> findAll() {
        try {
            return teacherInfoService.findAll();
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }

    @PutMapping("/{teacherId}")
    public String updateTeacherInfo(@PathVariable String teacherId, @RequestBody TeacherInfoDto dto) {
        try {
            TeacherInfoService.updateTeacherInfo(teacherId, dto);
        } catch (Exception e) {
            return "Internal Server Error";
        }
        return "Teacher-Info updated successfully";
    }

    @DeleteMapping("/{teacherId}")
    public String deleteTeacher(@PathVariable String teacherId) {
        try {
            teacherInfoService.deleteTeacher(teacherId);
            return "Teacher  Deleted Successfully";
        } catch (Exception e) {
            return "Delete Failed";
        }
    }


}
