package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UsuarioController {

    private final Logger logger = LoggerFactory.getLogger(UsuarioController.class);

    @RequestMapping("/inicio")
    public String CriaInicioChamada() {
        logger.info("INICIO CHAMADA");
        return "INICIO CHAMADA";
    }

    @RequestMapping("/fim")
    public String CriaFimChamada() {
        logger.info("FIM CHAMADA");
        return "FIM CHAMADA";
    }

}