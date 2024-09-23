package com.example.demo.designation;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Table(name = "DESIGNATION")
@Entity
public class Designation {

    @Id
    @Column(name = "DESIG_CODE")
    private String desigCode;
    @Column(name = "DESIG_DESC")
    private String desigDesc;
    @Column(name = "INS_USER")
    private String insUser;
    @Column(name = "INS_DATE")
    private Date insDate;
    @Column(name = "UPD_USER")
    private String updUser;
    @Column(name = "UPD_DATE")
    private Date updDate;

    public Designation() {
    }

    public Designation(String desigCode) {
        this.desigCode = desigCode;
    }

}