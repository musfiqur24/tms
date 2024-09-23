package com.example.demo.designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


 public interface DesignationRepository extends JpaRepository <Designation, String> {
 }
