package com.example.demo.teacher;


import com.example.demo.designation.Designation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TeacherInfoService {

    private static TeacherInfoRepository teacherInfoRepository = null;

    public TeacherInfoService(TeacherInfoRepository teacherInfoRepository) {
        this.teacherInfoRepository = teacherInfoRepository;
    }

        public long countTeachers() {
            return teacherInfoRepository.count();
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



    public List<TeacherInfoDto> findAll() {
        List<TeacherInfo> List = teacherInfoRepository.findAll();
        List<TeacherInfoDto> dtoList = new ArrayList<>();

        for (TeacherInfo teacher : List) {
            TeacherInfoDto dto = new TeacherInfoDto();
            dto.setTeacherId(teacher.getTeacherId());
            dto.setCompanyBranchCode(teacher.getCompanyBranchCode());
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

    public static void updateTeacherInfo(String teacherId, TeacherInfoDto dto) throws Exception {
        Optional<TeacherInfo> optionalTeacherInfo = teacherInfoRepository.findById(teacherId);

        if (optionalTeacherInfo.isPresent()) {
            TeacherInfo updateTeacherInfo = optionalTeacherInfo.get();
            updateTeacherInfo.setCompanyBranchCode(dto.getCompanyBranchCode());
            updateTeacherInfo.setFinanceCode(dto.getFinanceCode());
            updateTeacherInfo.setCompanyCode(dto.getCompanyCode());
            updateTeacherInfo.setProjectCode(dto.getProjectCode());
            updateTeacherInfo.setComponentCode(dto.getComponentCode());
            updateTeacherInfo.setTeacherName(dto.getTeacherName());
            updateTeacherInfo.setDesignation(new Designation(dto.getDesignationCode()));
            updateTeacherInfo.setInsUser(dto.getInsUser());
            updateTeacherInfo.setCreateDate(new Date());
//        teacherInfo.setUpdUser(dto);
//        teacherInfo.setUpdDate(new Date());
            teacherInfoRepository.save(updateTeacherInfo);
        } else {
            throw new Exception("TeacherId not found");
        }
    }

    public void deleteTeacher(String teacherId) {
        if (teacherInfoRepository.existsById(teacherId)) {
            teacherInfoRepository.deleteById(teacherId);
        } else {
            throw new RuntimeException("Teacher Not Found");
        }
    }

}
