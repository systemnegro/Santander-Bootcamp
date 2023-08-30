package edu.camilo.java.sintaxe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(operacoes.fullname("Camilo","Almeida"));
        SmartTv smartTv = new SmartTv();
        smartTv.ligar();
        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);
        smartTv.aumentarVolume();
        smartTv.mudarCanal(7);
        System.out.println(smartTv.volume);
        System.out.println(smartTv.canal);
    }


}
