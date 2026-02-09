package com.example.exerciciossb.controllers;

import com.example.exerciciossb.models.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClienteController {

    @GetMapping("/anyone")
    public Cliente getCliente() {
        return new Cliente(1, "João", "123.456.789-00");
    }

    @GetMapping("/byid/{id}")
    public Cliente getClienteById(@PathVariable int id) {
        return new Cliente(id, "Cristiano Ronaldo", "123.456.789-10");
    }

    @GetMapping("/byid2")
    public Cliente getClienteById2(@RequestParam(name = "id", required = true) int id, @RequestParam(name = "nome", defaultValue = "Desconecido") String nome) {
        return new Cliente(id, nome, "987.654.321-00");
    }

}
