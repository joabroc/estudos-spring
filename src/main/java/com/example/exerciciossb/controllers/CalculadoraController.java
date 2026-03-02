package com.example.exerciciossb.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

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
    public ResponseEntity<?> subtrair(
            @RequestParam(name = "primeiroValor") int a,
            @RequestParam(name = "segundoValor") int b) {
        if (b > a) {
            return ResponseEntity.badRequest().body(
                    Collections.singletonMap("message", "O segundo valor deve ser menor ou igual ao primeiro valor")
            );
        }
        return ResponseEntity.ok(Collections.singletonMap("result", a - b));
    }
}
