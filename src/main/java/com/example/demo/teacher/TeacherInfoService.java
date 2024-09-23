package com.example.demo.teacher;


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

    public void saveTeacher (
            String teacherId, String CompanyBranchCode, String FinanceCode,
            String companyCode, String ProjectCode, String ComponentCode,
            String TeacherName, String CurrentDesigId, String InsUser, String UpdUser){

        TeacherInfo teacherInfo = new TeacherInfo();
        teacherInfo.setTeacherId(teacherId);
        teacherInfo.setCompanyBranchCode(companyBranchCode);
        teacherInfo.setFinanceCode(financeCode);
        teacherInfo.setCompanyCode(companyCode);
        teacherInfo.setProjectCode(ProjectCode);
        teacherInfo.setComponentCode(ComponentCode);
        teacherInfo.setTeacherName(TeacherName);
        teacherInfo.setCurrentDesigId(CurrentDesigId);
        teacherInfo.setInsUser(InsUser);
        teacherInfo.setCreateDate(new Date());
        teacherInfo.setUpdUser(updUser);
        teacherInfo.setUpdDate(new Date());

//        System.out.println("Teacher Info Data " + teacherId+ " "+
//                CompanyBranchCode+ " "+
//                FinanceCode+ " "+
//                companyCode+ " "+
//                ProjectCode+ " "+
//                ComponentCode+ " "+
//                TeacherName+ " "+
//                CurrentDesigId+ " "+
//                InsUser+ " "+
//                UpdUser);
        teacherInfoRepository.save(teacherInfo);

    }

    public List<TeacherInfo> findAll() {
        List<TeacherInfo> List = teacherInfoRepository.findAll();
        List<TeacherInfo> dtoList = new ArrayList<>();

        for (TeacherInfo teacher : List) {
            TeacherInfo dto = new TeacherInfo();
            dto.setTeacherId(teacher.getTeacherId());
            dto.setCompanyBranchCode(teacher.getTeacherId());
            dto.setFinanceCode(teacher.getFinanceCode());
            dto.setCompanyCode(teacher.getCompanyCode());
            dto.setProjectCode(teacher.getProjectCode());
            dto.setComponentCode(teacher.getComponentCode());
            dto.setTeacherName(teacher.getTeacherName());
            dto.setCurrentDesigId(teacher.getCurrentDesigId());
            dto.setInsUser(teacher.getInsUser());
            dto.setUpdUser(teacher.getUpdUser());
            dtoList.add(dto);
        }
        System.out.println("data"+ dtoList);
        return dtoList;
    }


}
