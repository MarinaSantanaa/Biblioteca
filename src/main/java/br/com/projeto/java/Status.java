package br.com.projeto.java;

import br.com.projeto.java.biblioteca.Livro;
import br.com.projeto.java.pessoa.Aluno;
import br.com.projeto.java.pessoa.Professor;
import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@ToString

public class Status {

    public Status() {
    }

    public void chamarStatus(ArrayList<Aluno> alunos, ArrayList<Professor> professores, ArrayList<Livro> livros) {
        System.out.println("\nAlunos ativos: \n");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }

        System.out.println("\nProfessores ativos: \n");
        for (Professor professor : professores) {
            System.out.println(professor.getNome());

        }

        System.out.println("\nLivros ativos: \n");
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());

        }

    }

}
