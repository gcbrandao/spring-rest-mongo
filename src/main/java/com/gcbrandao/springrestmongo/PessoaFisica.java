package com.gcbrandao.springrestmongo;

import org.springframework.data.annotation.Id;

public class PessoaFisica {

    @Id
    private String id;
    private String nome;
    private String sobrenome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
