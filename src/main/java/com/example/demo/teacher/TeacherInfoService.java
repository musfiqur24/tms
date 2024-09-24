package com.example.demo.teacher;


import com.example.demo.designation.Designation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TeacherInfoService {

    private final TeacherInfoRepository teacherInfoRepository;

    public TeacherInfoService(TeacherInfoRepository teacherInfoRepository) {
        this.teacherInfoRepository = teacherInfoRepository;
    }

    public void saveTeacher(TeacherInfoDto dto) {
        TeacherInfo teacherInfo = new TeacherInfo();
        teacherInfo.setTeacherId(dto.getTeacherId());
        teacherInfo.setCompanyBranchCode(dto.getCompanyBranchCode());
        teacherInfo.setFinanceCode(dto.getFinanceCode());
        teacherInfo.setCompanyCode(dto.getCompanyCode());
        teacherInfo.setProjectCode(dto.getProjectCode());
        teacherInfo.setComponentCode(dto.getComponentCode());
        teacherInfo.setTeacherName(dto.getTeacherName());
        teacherInfo.setDesignation(new Designation(dto.getDesignationCode()));
        teacherInfo.setInsUser(dto.getInsUser());
        teacherInfo.setCreateDate(new Date());
//        teacherInfo.setUpdUser(dto);
//        teacherInfo.setUpdDate(new Date());
        teacherInfoRepository.save(teacherInfo);

    }
public String updateTeacher (String teacherId, TeacherInfoDto dto) throws Exception {
TeacherInfo teacherInfo = teacherInfoRepository.findById(teacherId).orElseThrow(() -> new Exception("Teacher Not Found "));

   teacherInfo.setCompanyCode(dto.getCompanyCode());
   teacherInfo.setCompanyBranchCode(dto.getCompanyBranchCode());
   teacherInfo.setFinanceCode(dto.getFinanceCode());
   teacherInfo.setComponentCode(dto.getComponentCode());
   teacherInfo.setDesignation(new Designation(dto.getDesignationCode()));
   teacherInfo.setTeacherName(dto.getTeacherName());
   teacherInfo.setProjectCode(dto.getProjectCode());
   teacherInfo.setInsUser(dto.getInsUser());
   teacherInfo.setCreateDate(new Date());

   teacherInfoRepository.save(teacherInfo);
   return "Teacher Updated Successfully";

}
    public List<TeacherInfoDto> findAll() {
        List<TeacherInfo> List = teacherInfoRepository.findAll();
        List<TeacherInfoDto> dtoList = new ArrayList<>();

        for (TeacherInfo teacher : List) {
            TeacherInfoDto dto = new TeacherInfoDto();
            dto.setTeacherId(teacher.getTeacherId());
            dto.setCompanyBranchCode(teacher.getTeacherId());
            dto.setFinanceCode(teacher.getFinanceCode());
            dto.setCompanyCode(teacher.getCompanyCode());
            dto.setProjectCode(teacher.getProjectCode());
            dto.setComponentCode(teacher.getComponentCode());
            dto.setTeacherName(teacher.getTeacherName());
            dto.setDesignationCode(teacher.getDesignation().getDesigCode());
            dto.setDesignationName(teacher.getDesignation().getDesigDesc());
            dto.setInsUser(teacher.getInsUser());
            dto.setUpdUser(teacher.getUpdUser());
            dtoList.add(dto);
        }
        System.out.println("data" + dtoList);
        return dtoList;
    }


}
