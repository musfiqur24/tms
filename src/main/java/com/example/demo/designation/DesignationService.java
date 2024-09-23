package com.example.demo.designation;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DesignationService {

    private final DesignationRepository designationRepository;

    public DesignationService(DesignationRepository designationRepository) {
        this.designationRepository = designationRepository;
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

}
