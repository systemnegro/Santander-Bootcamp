package edu.camilo.java.poo.construtor;
import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    ArrayList<Integer> lista = new ArrayList<>();



    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}