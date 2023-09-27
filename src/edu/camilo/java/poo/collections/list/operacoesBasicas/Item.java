package edu.camilo.java.poo.collections.list.operacoesBasicas;

public class Item {
    private String nome ;
    private double preco;
    private int quatidade;

    public Item(String nome, double preco, int quatidade) {
        this.nome = nome;
        this.preco = preco;
        this.quatidade = quatidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuatidade() {
        return quatidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quatidade=" + quatidade +
                '}';
    }
}
