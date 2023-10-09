package edu.camilo.java.stream.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio12 {
    public static void main(String[] args) {
//        Encontre o produto de todos os números da lista:
//        Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> produto = numeros.stream().reduce((a, b) -> a * b);
        System.out.println(produto);


    }
}
