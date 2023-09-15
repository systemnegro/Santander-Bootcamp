package edu.camilo.java.poo.gettersSetters;


//arquivo Escola.java
public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(8);
        Aluno Irineu = new Aluno();
        Irineu.setNome("Irineu");
        Irineu.setIdade(30);

        System.out.println("O aluno " + Irineu.getNome() + " tem " + Irineu.getIdade() + " anos ");
        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");

    }
}
