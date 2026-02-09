package com.example.exerciciossb.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/somar/{a}/{b}")
    public int somar(
            @PathVariable int a,
            @PathVariable int b) {
        return a + b;
    }

    @GetMapping("/subtrair")
    public int subtrair(
            @RequestParam(name = "primeiroValor", required = true) int a,
            @RequestParam(name = "segundoValor", required = true) int b) {
        if (b>a) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "O segundo valor deve ser menor que o primeiro valor");
        }
        return a - b;
    }
}
