package edu.camilo.java.poo.construtor;

public class SistemaCadastro {
    public static void main(String[] args) {
        //criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("Marcos","8565784");
        Pessoa irineu = new Pessoa("Irineu","74568");

        //definimos o endereço de marcos
        marcos.setEndereco("RUA DAS MARIAS");



        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
        System.out.println(irineu.getNome() + "-" + irineu.getCpf());

    }
}