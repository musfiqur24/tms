package com.example.demo.designation;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Table (name = "DESIGNATION")
@Entity
public class Designation {

    @Id
    @Column (name = "DESIG_CODE")
    private String desigCode;

    @Column (name = "DESIG_DESC")
    private String desigDesc;

    @Column (name = "INS_USER")
    private String insUser;

    @Column (name = "INS_DATE")
    private Date insDate;

    @Column (name = "UPD_USER")
    private String updUser;

    @Column (name = "UPD_DATE")
    private Date updDate;

}

//    DESIGNATION
//    DESIG_CODE
//    DESIG_DESC
//    INS_USER
//    INS_DATE
//    UPD_USER
//    UPD_DATE