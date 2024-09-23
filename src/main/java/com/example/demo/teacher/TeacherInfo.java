package com.example.demo.teacher;

import com.example.demo.designation.Designation;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Table(name = "TEACHER_INFO")
@Entity
public class TeacherInfo {

    @Id
    @Column(name = "TEACHER_ID")
    private String teacherId;

    @Column(name = "COMPANY_CODE")
    private String companyCode;

    @Column(name = "COMPANY_BRANCH_CODE")
    private String companyBranchCode;

    @Column(name = "FINANCE_CODE")
    private String financeCode;

    @Column(name = "PROJECT_CODE")
    private String projectCode;

    @Column(name = "COMPONENT_CODE")
    private String componentCode;

    @Column(name = "TEACHER_NAME")
    private String teacherName;

    @ManyToOne
    @JoinColumn(name = "CURRENT_DESIG_ID")
    private Designation designation;

    @Column(name = "INS_USER")
    private String insUser;

    @Column(name = "INS_DATE")
    private Date createDate;

    @Column(name = "UPD_USER")
    private String updUser;

    @Column(name = "UPD_DATE")
    private Date updDate;

}
