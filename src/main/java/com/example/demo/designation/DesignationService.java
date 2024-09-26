package com.example.demo.designation;

import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class DesignationService {

    private static DesignationRepository designationRepository = null;

    public DesignationService(DesignationRepository designationRepository) {
        this.designationRepository = designationRepository;
    }

    public long countDesignations() {
        return designationRepository.count();  // Assuming you're using JpaRepository
    }


    public void saveDesig(String desigCode, String desigDesc, String insUser, String updUser) {

        Designation designation = new Designation();
        designation.setDesigCode(desigCode);
        designation.setDesigDesc(desigDesc);
        designation.setInsUser(insUser);
        designation.setUpdUser(updUser);
        designation.setInsDate(new Date());
        designation.setUpdDate(new Date());

        designationRepository.save(designation);

    }


    public List<DesignationDto> show (){
       List<Designation> list = designationRepository.findAll();
       List<DesignationDto> dtoList = new ArrayList<>();
//        System.out.println();
       for (Designation designation : list){

           DesignationDto dto = new DesignationDto();
           dto.setDesigCode(designation.getDesigCode());
           dto.setDesigDesc(designation.getDesigDesc());
           dto.setInsUser(designation.getInsUser());
           dto.setUpdUser(designation.getUpdUser());
           dtoList.add(dto);


       }
       return dtoList;
    }


    public static void deleteDesignation(String desigCode) throws Exception {

        Optional<Designation> optionalDesignation = designationRepository.findById(desigCode);

        if (optionalDesignation.isPresent()) {
            designationRepository.deleteById(desigCode);  // Delete room if it exists
        } else {
            throw new Exception("DesigCode not found");
        }
    }

    public void updateDesignation(String desigCode, String desigDesc, String insUser, String updUser) throws Exception {
        Optional<Designation> optionalDesignation = designationRepository.findById(desigCode);

        if(optionalDesignation.isPresent()) {
            Designation upDesignation = optionalDesignation.get();
            upDesignation.setDesigDesc(desigDesc);
            upDesignation.setInsUser(insUser);
            upDesignation.setUpdUser(updUser);
            designationRepository.save(upDesignation);
        }else {
            throw new Exception("DesigCode not found");
        }

    }

}
