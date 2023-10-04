package edu.camilo.java.poo.collections.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasMap.isEmpty()) {
            palavrasMap.remove(palavra);
            if (palavra == null) {
                System.out.println("Palavra não encontrada.");
            }
        } else {
            System.out.println("não tem nenhuma palavra.");
        }
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int contagem : palavrasMap.values()){
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int mairContagem = 0;
        for (Map.Entry<String, Integer> entry : palavrasMap.entrySet()) {
            if (entry.getValue() > mairContagem) {
                mairContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
