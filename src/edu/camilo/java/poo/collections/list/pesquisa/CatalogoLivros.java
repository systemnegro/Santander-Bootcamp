package edu.camilo.java.poo.collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo,String autor,int anoPublicacao){
        livroList.add(new Livro(titulo,autor,anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
        return livrosPorAutor;
    }
    public  List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrospesquisarPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrospesquisarPorIntervaloAnos.add(l);
                }
            }
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
            return livrospesquisarPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                   livroPorTitulo = l;
                   break;
                }
            }
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
        return livroPorTitulo;
    }

}

