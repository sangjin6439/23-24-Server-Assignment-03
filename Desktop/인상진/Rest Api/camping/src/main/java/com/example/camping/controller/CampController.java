package com.example.camping.controller;

import com.example.camping.dto.CampDto;
import com.example.camping.service.CampService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CampController {

    private final CampService campService;

    public CampController(CampService campService) {
        this.campService = campService;
    }


    @PostMapping("camps")
    public void save(@RequestBody CampDto campDto) {
        campService.saveCamp(campDto);
    }

    @GetMapping("camps/{id}")
    public CampDto findById(@PathVariable Long id) {
        return campService.findcampById(id);
    }

    @GetMapping("camps/list")
    public List<CampDto> findAllcamp() {
        return campService.findAllcamp();
    }

    @PatchMapping("camps/{id}")
    public void updateById(@PathVariable Long id,@RequestBody CampDto campDto) {
        campService.updateById(id, campDto);
    }

    @DeleteMapping("camps/{id}")
    public void deleteById(@PathVariable  Long id){
        campService.deleteById(id);
    }
}
