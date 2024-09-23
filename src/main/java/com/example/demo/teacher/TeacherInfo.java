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
