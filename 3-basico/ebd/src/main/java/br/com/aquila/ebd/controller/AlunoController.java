package br.com.aquila.ebd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ebd")
public class AlunoController {
    @GetMapping
    public String todos(){
        return "todos alunos";
    }
}
