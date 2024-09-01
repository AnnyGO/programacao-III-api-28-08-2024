package br.edu.umfg.prog.tres.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthcheck")
public class Healthcheck {
    //Controlador que verifica se a API está rodando corretamente
    @GetMapping
    public ResponseEntity<String> get(){
        return ResponseEntity.ok("API em Execução!");
    }
}
