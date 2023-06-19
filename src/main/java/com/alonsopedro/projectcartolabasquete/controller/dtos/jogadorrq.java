package com.alonsopedro.projectcartolabasquete.controller.dtos;

import java.util.Objects;

public class jogadorrq {

    private String nome;
    private String funcao;
    private String franquia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getFranquia() {
        return franquia;
    }

    public void setFranquia(String franquia) {
        this.franquia = franquia;
    }
}
