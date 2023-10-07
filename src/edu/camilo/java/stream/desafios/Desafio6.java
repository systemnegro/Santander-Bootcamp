package edu.camilo.java.stream.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
//        Verificar se a lista contém algum número maior que 10:
//        Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream().filter((n -> n > 10)).forEach(System.out::println);
    }
}
