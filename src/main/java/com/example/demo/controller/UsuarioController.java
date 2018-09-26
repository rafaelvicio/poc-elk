package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UsuarioController {

    @RequestMapping("/usuarios")
    public String GetUsuario() {
        return "hahahah";
    }

}