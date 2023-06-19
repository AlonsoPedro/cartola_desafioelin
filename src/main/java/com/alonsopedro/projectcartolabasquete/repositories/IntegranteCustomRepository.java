package com.alonsopedro.projectcartolabasquete.repositories;

import com.alonsopedro.projectcartolabasquete.models.Integrante;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public class IntegranteCustomRepository {


    private final EntityManager em;

    public IntegranteCustomRepository(EntityManager em) {
        this.em = em;
    }

    public List<Integrante> find(long id, String nome, String funcao, String franquia){

        String query = "select P from Pessoa as P ";
        String condicao = "where";

        query += condicao + " P.id = :id";
        condicao = " and ";

        if(nome != null) {
            query += condicao + " P.nome = :nome";
            condicao = " and ";
        }

        if(funcao != null) {
            query += condicao + " P.sobrenome = :sobrenome";
        }
        if(franquia != null) {
            query += condicao + " P.sobrenome = :sobrenome";
        }

        var q = em.createQuery(query, Integrante.class);

        q.setParameter("id", id);

        if(nome != null) {
            q.setParameter("nome", nome);
        }

        if(funcao != null) {
            q.setParameter("funcao ", funcao);
        }
        if(franquia != null) {
            q.setParameter("franquia ", franquia);
        }

        return q.getResultList();
    }

}


