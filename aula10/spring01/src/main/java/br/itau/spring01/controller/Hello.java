package br.itau.spring01.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // indica que esta classe é um controller do tipo REST (essa anotação que va fazer com que funcione)
@CrossOrigin ("*") // aceita requisições de qualquer outro dominio
@RequestMapping ("/hello") // nome do recurso que está sendo acessado
public class Hello { // classe

    @GetMapping // esse método é acessado por um GET
    public String ola() {  // metodo
        return "Hello world"; // va retornar um texto
    }
    
}
