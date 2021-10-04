package br.com.projeto.java.biblioteca;

import br.com.projeto.java.pessoa.Aluno;
import br.com.projeto.java.pessoa.Professor;

import java.util.Date;
import java.util.List;

public class Emprestimo implements Biblioteca {
    Date diaEmprestimo;
    Date diaDevolucao;


    @Override
    public void emprestar() {

    }

    @Override
    public void devolver() {

    }

    @Override
    public void bloquear() {

    }

    @Override
    public void desbloquear() {

    }

    @Override
    public void cadastrarLivro() {

    }

    @Override
    public void cadastrarPessoa() {

    }

    @Override
    public void status() {

    }

    public void status(List<Aluno> alunos, List<Professor> professores, List<Livro> livros) {
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