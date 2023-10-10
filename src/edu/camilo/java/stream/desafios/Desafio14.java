package edu.camilo.java.stream.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio14 {
    public static void main(String[] args) {
//        Encontre o maior número primo da lista:
//        Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

       Optional<Integer> maiorPrimo = numeros.stream().distinct().filter((n -> {
           if (n <= 1) {
               return false;
           }
           for (int i = 2; i <= Math.sqrt(n); i++) {
               if (n % i == 0) {
                   return false;
               }
           }
           return true;

        })).max(Integer::compareTo);

        System.out.println(maiorPrimo);



    }

}
