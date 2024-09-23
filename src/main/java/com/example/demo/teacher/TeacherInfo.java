package com.example.demo.teacher;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Table (name = "TEACHER_INFO")
@Entity
public class TeacherInfo {

    @Id                             //primary key
    @Column (name = "TEACHER_ID")
    private String teacherId;

    @Column (name = "COMPANY_CODE")
    private String companyCode;

    @Column (name = "COMPANY_BRANCH_CODE")
    private String companyBranchCode;

    @Column (name = "FINANCE_CODE")
    private String financeCode;

    @Column (name = "PROJECT_CODE")
    private String projectCode;

    @Column (name = "COMPONENT_CODE")
    private String componentCode;

    @Column (name = "TEACHER_NAME")
    private String teacherName;

    @Column (name = "CURRENT_DESIG_ID")
    private String currentDesigId;

    @Column (name = "INS_USER")
    private String insUser;

    @Column (name = "INS_DATE")
    private Date createDate;

    @Column (name = "UPD_USER")
    private String updUser;

    @Column (name = "UPD_DATE")
    private Date updDate;

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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdUser() {
        return updUser;
    }

    public void setUpdUser(String updUser) {
        this.updUser = updUser;
    }

    public Date getUpdDate() {
        return updDate;
    }

    public void setUpdDate(Date updDate) {
        this.updDate = updDate;
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
