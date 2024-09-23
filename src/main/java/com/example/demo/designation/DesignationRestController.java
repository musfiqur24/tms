package com.example.demo.designation;


import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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

    @PutMapping("/{desigCode}")
    public String updateDesignation(@PathVariable String desigCode, @RequestBody DesignationDto dto) {
        try {
            designationService.updateDesignation(desigCode, dto.getDesigDesc(), dto.getInsUser(), dto.getUpdUser());
        } catch (Exception e) {
            return "Internal Server Error";
        }
        return "Designation updated successfully";
    }

    @DeleteMapping("/{desigCode}")
    public ResponseEntity<String> deleteDesignation(@PathVariable String desigCode) {
        try {
            DesignationService.deleteDesignation(desigCode);
            return ResponseEntity.ok("Designation deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }


    @GetMapping
    public List<DesignationDto> show() {

        try {
            return designationService.show();
        } catch (Exception e) {
            return Collections.emptyList();
        }

    }
}


