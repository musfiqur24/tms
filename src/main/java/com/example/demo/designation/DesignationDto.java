package com.example.demo.designation;

import jakarta.persistence.Column;

import java.util.Date;

public class DesignationDto {


    private String desigCode;

    private String desigDesc;

    private String insUser;

    private String updUser;

    public String getDesigCode() {
        return desigCode;
    }

    public void setDesigCode(String desigCode) {
        this.desigCode = desigCode;
    }

    public String getDesigDesc() {
        return desigDesc;
    }

    public void setDesigDesc(String desigDesc) {
        this.desigDesc = desigDesc;
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
