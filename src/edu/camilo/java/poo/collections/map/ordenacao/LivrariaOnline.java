package edu.camilo.java.poo.collections.map.ordenacao;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livrosMap;
    Set<String> list = new TreeSet<>();

    public LivrariaOnline() {
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro) {
        livrosMap.put(link, livro);
    }

    public void removerLivro(String titulo) {
        List<String> chavesRemover = new ArrayList<>();
        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                chavesRemover.add(entry.getKey());
            }
        }
        for (String chave : chavesRemover) {
            livrosMap.remove(chave);
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {

        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrosMap.entrySet());

        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            Livro livro = entry.getValue();
            if (livro.getAutor().equals(autor)) {
                livrosPorAutor.put(entry.getKey(), livro);
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> obterLivroMaisCaro() {
        List<Livro> livrosMaisCaro = new ArrayList<>();
        double livroMaisCaro = 0;
        if (!livrosMap.isEmpty()) {
            for (Livro l : livrosMap.values()) {
                if (l.getPreco() > livroMaisCaro) {
                    livroMaisCaro = l.getPreco();
                }
            }
        } else {
            System.out.println("Nenhum livro na livraria.");
        }
        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            if (entry.getValue().getPreco() == livroMaisCaro) {
                Livro livroComPrecoMaisAlto = livrosMap.get(entry.getKey());
                livrosMaisCaro.add(livroComPrecoMaisAlto);
            }

        }
        return livrosMaisCaro;
    }

    public void exibirLivroMaisBarato() {
        if (!livrosMap.isEmpty()) {
            String livro = null;
            int livroMaisCaro = 0;
            for (Livro l : livrosMap.values()) {
                if (l.getPreco() > livroMaisCaro) {
                    livro = l.getTitulo();
                    System.out.println(livro);
                }
            }
        }
    }

}
