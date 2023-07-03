package com.example.bankSystem.controllers;


import com.example.bankSystem.models.bankModels.RstrList;
import com.example.bankSystem.services.RstrListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/rstr")
public class RstrListController {

    private final RstrListService service;

    @Autowired
    public RstrListController(RstrListService service) {
        this.service = service;
    }

    @GetMapping
    public RstrList getByPartInfo(@RequestParam Long partInfo){
        return service.getByPartInfo(partInfo);
    }
}
