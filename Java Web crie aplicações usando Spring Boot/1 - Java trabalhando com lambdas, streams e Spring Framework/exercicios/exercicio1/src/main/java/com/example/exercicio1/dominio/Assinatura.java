package com.example.exercicio1.dominio;

public class Assinatura {

    private String tipo;
    private double preco;

    public Assinatura(String tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
    }

    public Assinatura(){}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
