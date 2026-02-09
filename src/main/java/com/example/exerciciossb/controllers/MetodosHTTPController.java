package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/methods")
public class MetodosHTTPController {

    @GetMapping("/get")
    public String metodoGet() {
        return "Requisição GET recebida!";
    }

    @PostMapping("/post")
    public String metodoPost() {
        return "Requisição POST recebida!";
    }

    @PutMapping("/put")
    public String metodoPut() {
        return "Requisição PUT recebida!";
    }

    @DeleteMapping("/delete")
    public String metodoDelete() {
        return "Requisição DELETE recebida!";
    }
}
