package com.consurural.consurural.controllers;

import com.consurural.consurural.services.ConsultancesService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/consultances")
@CrossOrigin(origins = "*")
public class ConsultancesController {

    private ConsultancesService consultancesService;

    public void ConsultancesService(ConsultancesService consultancesService) {
        this.consultancesService = consultancesService;
    }



}
