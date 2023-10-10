package edu.camilo.java.stream.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main(String[] args) {
//        Verifique se todos os números da lista são iguais:
//        Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(5,5,5,5,5,5);

        boolean iguais = numeros.stream().allMatch(n -> n.equals(numeros.get(0)));

        System.out.println(iguais);

    }
}
