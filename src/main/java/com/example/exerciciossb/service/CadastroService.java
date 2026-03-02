package com.example.exerciciossb.service;

import com.example.exerciciossb.dto.ClienteRequest;
import com.example.exerciciossb.dto.ClienteResponse;
import com.example.exerciciossb.models.entities.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CadastroService {

    public ClienteResponse getClienteById(int idBusca) {
        int id;
        String nome;
        String cpf;

        switch (idBusca) {
            case 1:
                id = 1;
                nome = "Maria";
                cpf = "123.456.789-00";
                break;
            case 2:
                id = 2;
                nome = "João";
                cpf = "987.654.321-00";
                break;
            case 3:
                id = 3;
                nome = "Ana";
                cpf = "456.789.123-00";
                break;
            case 4:
                id = 4;
                nome = "Carlos";
                cpf = "789.123.456-00";
                break;
            case 5:
                id = 5;
                nome = "Fernanda";
                cpf = "321.654.987-00";
                break;
            case 6:
                id = 6;
                nome = "Ricardo";
                cpf = "654.321.987-00";
                break;
            case 7:
                id = 7;
                nome = "Sofia";
                cpf = "987.321.654-00";
                break;
            case 8:
                id = 8;
                nome = "Lucas";
                cpf = "321.987.654-00";
                break;
            case 9:
                id = 9;
                nome = "Isabela";
                cpf = "654.987.321-00";
                break;
            case 10:
                id = 10;
                nome = "Gabriel";
                cpf = "987.654.321-00";
                break;
            default:
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado");
        }

        Cliente cliente = new Cliente(id, nome, cpf);

        return new ClienteResponse(cliente.getNome(), cliente.getCpf());

    }

    public ClienteResponse cadastrarCliente(ClienteRequest cliente) {

        int idGerado = (int) (Math.random() * 1000); // Gera um ID aleatório para o cliente

        Cliente clienteCadastrado = new Cliente(idGerado, cliente.getNome(), cliente.getCpf());

        return new ClienteResponse(clienteCadastrado.getNome(), clienteCadastrado.getCpf());
    }
}
