package edu.camilo.java.sintaxe;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(operacoes.fullname("Camilo","Almeida"));

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);
        smartTv.aumentarVolume();
        smartTv.mudarCanal(7);
        System.out.println(smartTv.volume);
        System.out.println(smartTv.canal);

        /*Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Diga teu nome e sobrenome: ");
        String nome = scanner.nextLine();
        System.out.println("Diga sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Diga sua idade ");
        int idade = scanner.nextInt();
        System.out.println("ola " + nome);
        System.out.println("Altura " + altura);
        System.out.println("Idade " + idade);*/
    }


}
