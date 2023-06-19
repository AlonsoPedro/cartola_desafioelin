package com.alonsopedro.projectcartolabasquete.models;


import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "TB_INTEGRANTES")
public class Integrante implements Serializable {

        private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    private String franquia;

    private String nome;

    private String funcao;

    @OneToMany(mappedBy = "integrante")
    private List<ComposicaoTime> composicaoTime;


    public Integrante(DadosCadastroJogadores cadastroJogadores){
        this.franquia = cadastroJogadores.franquia();
        this.nome = cadastroJogadores.nome();
        this.funcao= cadastroJogadores.funcao();
    }
    public Integrante() {
        this.franquia = franquia;
        this.nome = nome;
        this.funcao = funcao;
        this.composicaoTime = composicaoTime;
    }

    @Override
    public String toString() {
        return "Integrante{" +
                "id=" + id +
                ", franquia='" + franquia + '\'' +
                ", nome='" + nome + '\'' +
                ", funcao='" + funcao + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFranquia() {
        return franquia;
    }

    public void setFranquia(String franquia) {
        this.franquia = franquia;
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

    public List<ComposicaoTime> getComposicaoTime() {
        return composicaoTime;
    }

    public void setComposicaoTime(List<ComposicaoTime> composicaoTime) {
        this.composicaoTime = composicaoTime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Integrante)) return false;
        Integrante that = (Integrante) o;
        return id == that.id && Objects.equals(franquia, that.franquia) && Objects.equals(nome, that.nome) && Objects.equals(funcao, that.funcao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, franquia, nome, funcao);
    }


}
