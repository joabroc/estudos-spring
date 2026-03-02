package com.example.exerciciossb.controllers;

import com.example.exerciciossb.dto.ClienteRequest;
import com.example.exerciciossb.dto.ClienteResponse;
import com.example.exerciciossb.service.CadastroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    private final CadastroService cadastroService;

    public CadastroController(CadastroService cadastroService) {
        this.cadastroService = cadastroService;
    }

    @GetMapping("/buscar")
    public ClienteResponse buscarClientePorId(
            @RequestParam(name = "id") int idBusca) {
        return cadastroService.getClienteById(idBusca);
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<ClienteResponse> cadastrarCliente(
            @Valid @RequestBody ClienteRequest clienteRequest) {
        ClienteResponse response = cadastroService.cadastrarCliente(clienteRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
