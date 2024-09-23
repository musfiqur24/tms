package com.example.demo.teacher;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

public class TeacherInfoDto {

    private String teacherId;
    private String companyCode;
    private String companyBranchCode;
    private String financeCode;
    private String projectCode;
    private String componentCode;
    private String teacherName;
    private String currentDesigId;
    private String insUser;
    private String updUser;

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public void setCompanyBranchCode(String companyBranchCode) {
        this.companyBranchCode = companyBranchCode;
    }

    public void setFinanceCode(String financeCode) {
        this.financeCode = financeCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public void setComponentCode(String componentCode) {
        this.componentCode = componentCode;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setCurrentDesigId(String currentDesigId) {
        this.currentDesigId = currentDesigId;
    }

    public void setInsUser(String insUser) {
        this.insUser = insUser;
    }

    public void setUpdUser(String updUser) {
        this.updUser = updUser;
    }
}







//    TEACHER_INFO
//    COMPANY_CODE
//    COMPANY_BRANCH_CODE
//    FINANCE_CODE
//    PROJECT_CODE
//    COMPONENT_CODE
//    TEACHER_ID
//    TEACHER_NAME
//    CURRENT_DESIG_ID
//    INS_USER
//    INS_DATE
//    UPD_USER
//    UPD_DATE