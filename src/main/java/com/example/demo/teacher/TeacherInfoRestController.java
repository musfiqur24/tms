package com.example.demo.teacher;

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
    public String doSave(@RequestBody TeacherInfoDto dto){
        try {
            teacherInfoService.saveTeacher(
                    dto.getTeacherId(), dto.getCompanyBranchCode(), dto.getFinanceCode(),
                    dto.getCompanyCode(), dto.getProjectCode(), dto.getComponentCode(),
                    dto.getTeacherName(), dto.getCurrentDesigId(), dto.getInsUser(), dto.getUpdUser());
        } catch (Exception e) {
            return "Internal Server Error";
        }
        return "Return save successfully";
    }

    @GetMapping
    public List<TeacherInfo> findAll() {
        try {
            return teacherInfoService.findAll();
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }


}
