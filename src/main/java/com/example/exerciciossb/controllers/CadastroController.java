package com.example.exerciciossb.controllers;

import com.example.exerciciossb.models.Cliente;
import com.example.exerciciossb.service.CadastroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    private final CadastroService cadastroService;

    public CadastroController(CadastroService cadastroService) {
        this.cadastroService = cadastroService;
    }

    @GetMapping("/buscar")
    public Cliente buscarClientePorId(
            @RequestParam(name = "id") int idBusca) {
        return cadastroService.getClienteById(idBusca);
    }
}
