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
    public Integer calcularSoma(){
       Integer soma =0;
       for (Integer n : integerList){
           soma += n;
       }
       return soma;
    }
    public Integer encontrarMaiorNumero(){
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
    public Integer encontrarMenorNumero(){
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
}
