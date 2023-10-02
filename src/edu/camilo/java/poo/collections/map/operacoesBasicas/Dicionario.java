package edu.camilo.java.poo.collections.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("O Dicionário estár vazio");
        }
    }

    public void exibirPalavras() {
        if (!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        } else {
            System.out.println("O Dicionário estár vazio");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicao = dicionarioMap.get(palavra);
        if (!dicionarioMap.isEmpty()) {
            if (definicao != null) {
                return definicao;
            }
        } else {
            System.out.println("O Dicionário estár vazio");
        }
        return "Palavra não encontrada.";
    }
}
