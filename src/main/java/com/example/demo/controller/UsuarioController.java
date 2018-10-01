package com.example.demo.controller;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UsuarioController {

    private final Logger logger = LoggerFactory.getLogger(UsuarioController.class);

    Random rand = new Random();

    @RequestMapping("/inicio")
    public String CriaInicioChamada() {
        logger.info("INICIO CHAMADA | " + rand.nextInt(50) + 1);
        return "INICIO CHAMADA";
    }

    @RequestMapping("/fim")
    public String CriaFimChamada() {
        logger.info("FIM CHAMADA | " + rand.nextInt(50) + 1);
        return "FIM CHAMADA";
    }

}