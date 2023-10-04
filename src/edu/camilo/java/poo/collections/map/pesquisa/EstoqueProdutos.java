package edu.camilo.java.poo.collections.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    Map<Long, Produto> produtosMap;

    public EstoqueProdutos() {
        this.produtosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        produtosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(produtosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalestoque = 0d;
        if (!produtosMap.isEmpty()) {
            for (Produto p : produtosMap.values()) {
                valorTotalestoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalestoque;
    }
    public double obterProdutoMaisCaro(){
        double produtoMaisCaro = 0d;
        if (!produtosMap.isEmpty()){
            for (Produto p : produtosMap.values()){
                if (p.getPreco() > produtoMaisCaro){
                    produtoMaisCaro = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }
}
