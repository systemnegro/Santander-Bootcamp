package edu.camilo.java.stream.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) {
//        Encontre a soma dos quadrados de todos os números da lista:
//        Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int somaQuadrados = numeros.stream().mapToInt(n -> n * n).sum();

        System.out.println(somaQuadrados);
    }
}
