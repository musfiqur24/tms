package com.example.demo.teacher;

import jakarta.persistence.Column;

import java.util.Date;

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

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyBranchCode() {
        return companyBranchCode;
    }

    public void setCompanyBranchCode(String companyBranchCode) {
        this.companyBranchCode = companyBranchCode;
    }

    public String getFinanceCode() {
        return financeCode;
    }

    public void setFinanceCode(String financeCode) {
        this.financeCode = financeCode;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getComponentCode() {
        return componentCode;
    }

    public void setComponentCode(String componentCode) {
        this.componentCode = componentCode;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCurrentDesigId() {
        return currentDesigId;
    }

    public void setCurrentDesigId(String currentDesigId) {
        this.currentDesigId = currentDesigId;
    }

    public String getInsUser() {
        return insUser;
    }

    public void setInsUser(String insUser) {
        this.insUser = insUser;
    }

    public String getUpdUser() {
        return updUser;
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