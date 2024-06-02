package com.example.estruturadedados_lista;

public class Produto {
    private String nome;
    private String marca;
    private String cor;
    private float valor;

    public Produto(String nome, String marca, String cor, float valor) {
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + " - " + marca;
    }
}
