package edu.camilo.java.poo.collections.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        for (Aluno a : alunoSet) {
            if (a.getMatricula().equals(matricula)) {
                alunoSet.remove(a);
                break;
            }
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        System.out.println(alunosPorNome);
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> exibirAlunosPorNota = new TreeSet<>(new ComparatorPoNota());
        exibirAlunosPorNota.addAll(alunoSet);
        System.out.println(exibirAlunosPorNota);
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

}
