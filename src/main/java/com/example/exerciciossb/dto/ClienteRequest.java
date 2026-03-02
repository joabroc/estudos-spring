package com.example.exerciciossb.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ClienteRequest {

    @NotBlank(message = "O nome do cliente é obrigatório.")
    private String nome;

    @NotBlank(message = "O CPF do cliente é obrigatório.")
    @Size(min = 11, max = 11, message = "O CPF deve conter exatamente 11 caracteres sem a necessidade de pontuação.")
    private String cpf;

    public ClienteRequest() {
    }

    public ClienteRequest(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
