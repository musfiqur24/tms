package com.example.demo.designation;

import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;


@Service
public class DesignationService {

    private static DesignationRepository repository = null;

    public DesignationService(DesignationRepository repository) {
        this.repository = repository;
    }

    public void saveRoom(String desigDesc, String insUser, String updUser){
        DesignationDto designationDto = new DesignationDto();
        designationDto.setDesigDesc(desigDesc);
        designationDto.setInsUser(insUser);
        designationDto.setUpdUser(updUser);
//        repository.save(designation);

    }

    public static void deleteDesignation(String desigCode) throws Exception {

        Optional<Designation> optionalDesignation = repository.findById(desigCode);

        if (optionalDesignation.isPresent()) {
            repository.deleteById(desigCode);  // Delete room if it exists
        } else {
            throw new Exception("DesigCode not found");
        }
    }

    public void updateDesignation(String desigCode, String desigDesc, String insUser, String updUser) throws Exception {
        Optional<Designation> optionalDesignation = repository.findById(desigCode);

        if(optionalDesignation.isPresent()) {
            Designation upDesignation = optionalDesignation.get();
            upDesignation.setDesigDesc(desigDesc);
            upDesignation.setInsUser(insUser);
            upDesignation.setUpdUser(updUser);
            repository.save(upDesignation);
        }else {
            throw new Exception("DesigCode not found");
        }

    }

    public List<DesignationDto> findAll() {
        List<Designation> list = repository.findAll();
        List<DesignationDto> dtoList = new ArrayList<>();

        for(Designation designation : list) {
            DesignationDto dto = new DesignationDto();
            dto.setDesigDesc(designation.getDesigDesc());
            dto.setInsUser(designation.getInsUser());
            dto.setUpdUser(designation.getUpdUser());
            dtoList.add(dto);

        }
        return dtoList;
    }
    public DesignationDto findById(String desigcode) throws Exception {
        Optional<Designation> optionalDesignation = repository.findById(desigcode);

        if (optionalDesignation.isPresent()) {
            Designation designation = optionalDesignation.get();
            DesignationDto dto = new DesignationDto();
            dto.setDesigDesc(designation.getDesigDesc());
            dto.setInsUser(designation.getInsUser());
            dto.setUpdUser(designation.getUpdUser());
            return dto;
        } else {
            throw new Exception("Designation with ID " + desigcode + " not found.");
        }
    }



}
