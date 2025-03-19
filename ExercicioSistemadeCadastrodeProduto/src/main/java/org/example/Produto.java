package org.example;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirInformacoes() {
        System.out.println("Código do produto: " + codigo + ", Nome do produto: " + nome + ", Preço do produto: R$ " + preco);
    }
}