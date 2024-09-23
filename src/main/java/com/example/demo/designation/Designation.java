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

    public String getDesigDesc() {
        return desigDesc;
    }

    public void setDesigDesc(String desigDesc) {
        this.desigDesc = desigDesc;
    }

    @Column (name = "INS_USER")
    private String insUser;

    public String getInsUser() {
        return insUser;
    }

    public void setInsUser(String insUser) {
        this.insUser = insUser;
    }

    @Column (name = "INS_DATE")
    private Date insDate;

    public String getUpdUser() {
        return updUser;
    }

    public void setUpdUser(String updUser) {
        this.updUser = updUser;
    }

    @Column (name = "UPD_USER")
    private String updUser;

    @Column (name = "UPD_DATE")
    private Date updDate;

    public String getDesigCode() {
        return desigCode;
    }

    public void setDesigCode(String desigCode) {
        this.desigCode = desigCode;
    }


    public Date getInsDate() {
        return insDate;
    }

    public void setInsDate(Date insDate) {
        this.insDate = insDate;
    }


    public Date getUpdDate() {
        return updDate;
    }

    public void setUpdDate(Date updDate) {
        this.updDate = updDate;
    }
}

//    DESIGNATION
//    DESIG_CODE
//    DESIG_DESC
//    INS_USER
//    INS_DATE
//    UPD_USER
//    UPD_DATE