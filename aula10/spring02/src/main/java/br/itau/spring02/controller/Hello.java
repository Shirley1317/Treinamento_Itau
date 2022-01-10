package br.itau.spring02.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // indica que esta classe é um controller do tipo REST  
@CrossOrigin("*") // aceita requisições de qualquer outro dominio
@RequestMapping("/hello") // nome do recurso que está sendo acessado

public class Hello {

    @GetMapping // informa como o método deve ser acessado// esse método é acessado por um GET
    public String ola() {  // metodo
        return "Hello world";
        
    }
    
}
