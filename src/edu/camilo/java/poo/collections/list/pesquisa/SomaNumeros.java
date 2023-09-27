package edu.camilo.java.poo.collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> integerList;

    public SomaNumeros() {
        this.integerList = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        integerList.add(numero);
    }
    public int calcularSoma(){
       Integer soma =0;
       for (Integer n : integerList){
           soma += n;
       }
       return soma;
    }
    public int encontrarMaiorNumero(){
        Integer maiorNumero = Integer.MIN_VALUE;
        if(!integerList.isEmpty()){
            for (Integer n : integerList){
                if(n > maiorNumero){
                    maiorNumero = n;
                }
            }
        }else {
            throw new RuntimeException("A lista está vazia");
        }
        return maiorNumero;
    }
    public int encontrarMenorNumero(){
        Integer menorNumero = Integer.MAX_VALUE;
        if(!integerList.isEmpty()){
            for (Integer n : integerList){
                if(n < menorNumero){
                    menorNumero = n;
                }
            }
        }else {
            throw new RuntimeException("A lista está vazia");
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        if(!integerList.isEmpty()){
            System.out.println(integerList);

        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }
    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
