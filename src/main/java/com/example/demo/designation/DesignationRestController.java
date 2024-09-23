package com.example.demo.designation;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/designation")
public class DesignationRestController {

    private final DesignationService designationService;

    public DesignationRestController(DesignationService designationService) {
        this.designationService = designationService;
    }

    @PostMapping
    public String saveDesignation(@RequestBody DesignationDto dto) {
        try {
            designationService.saveDesig(dto.getDesigCode(), dto.getDesigDesc(), dto.getInsUser(), dto.getUpdUser());
        } catch (Exception e) {
            return "Internal Server Error";
        }
        return "Designation Save Successfully";


    }


    @GetMapping
    public List<DesignationDto> show(){

        try{
            return designationService.show();
        } catch (Exception e)
        {
            return Collections.emptyList();
        }

    }
}


