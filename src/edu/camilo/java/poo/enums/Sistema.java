package edu.camilo.java.poo.enums;

public class Sistema {
    public static void main(String[] args) {
        for (EstadoBrasileiro  e:EstadoBrasileiro.values()){
            System.out.println(e.getSigla() + "-" + e.getNome());
        }
    }
}
