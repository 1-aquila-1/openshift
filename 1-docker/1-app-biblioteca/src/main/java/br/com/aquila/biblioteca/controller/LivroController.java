package br.com.aquila.biblioteca.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/biblioteca/livro")
public class LivroController {
    @GetMapping
    public ResponseEntity<?> livros(){
        return ResponseEntity.ok("Lista de livro");
    }
}
