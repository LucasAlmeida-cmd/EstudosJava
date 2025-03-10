package com.example.exercicio1.dominio;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private String pessoaResponsavel;


    public Tarefa(String pessoaResponsavel, String descricao, boolean concluida) {
        this.pessoaResponsavel = pessoaResponsavel;
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public Tarefa(){

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String getPessoaResponsavel() {
        return pessoaResponsavel;
    }

    public void setPessoaResponsavel(String pessoaResponsavel) {
        this.pessoaResponsavel = pessoaResponsavel;
    }


    @Override
    public String toString() {
        return "Tarefa{" +
                "nome='" + descricao + '\'' +
                ", descricao='" + concluida + '\'' +
                ", concluida=" + pessoaResponsavel +
                '}';
    }
}