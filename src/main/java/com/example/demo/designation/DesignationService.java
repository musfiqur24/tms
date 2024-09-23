package com.example.demo.designation;

import org.springframework.stereotype.Service;

@Service
public class DesignationService {

    private final DesignationRepository designationRepository ;

    public DesignationService(DesignationRepository designationRepository) {
        this.designationRepository = designationRepository;
    }
}
