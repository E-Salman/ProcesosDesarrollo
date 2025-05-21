package com.clase5.clase5.controller;

import com.clase5.clase5.config.EmpresaSingleton;
import com.clase5.clase5.config.Empresa;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pruebas")
public class Ping {

    Empresa empresa;  

    @Autowired
    public Ping(Empresa empresa) {
        this.empresa = empresa;
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/empresa")
    public String empresa() {
        // return EmpresaSingleton.getInstancia().mostrarMensaje();
        return empresa.toString();
    }


}