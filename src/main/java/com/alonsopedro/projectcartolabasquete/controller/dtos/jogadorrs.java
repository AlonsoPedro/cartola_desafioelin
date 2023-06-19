package com.alonsopedro.projectcartolabasquete.controller.dtos;

import com.alonsopedro.projectcartolabasquete.models.Integrante;

public class jogadorrs {

    private long id;
    private String nome;
    private String funcao;
    private String franquia;

    public static Integrante converter(Integrante p){
        var joga = new Integrante();
        joga.setId(p.getId());
        joga.setNome(p.getNome());
        joga.setFuncao(p.getFuncao());
        joga.setFranquia(p.getFranquia());
        return joga;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
