package edu.camilo.java.poo.collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    private List<Integer> integerList;


    public OrdenacaoNumeros() {
        this.integerList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        integerList.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(integerList);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDecendente = new ArrayList<>(integerList);
        numerosDecendente.sort(Collections.reverseOrder());
        return numerosDecendente;
    }
    public void exibirNumeros(){
        System.out.println(integerList);
    }

}
