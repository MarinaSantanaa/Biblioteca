package br.com.projeto.java;

import br.com.projeto.java.biblioteca.Calendario;
import br.com.projeto.java.biblioteca.Emprestimo;
import br.com.projeto.java.biblioteca.Livro;
import br.com.projeto.java.pessoa.Aluno;
import br.com.projeto.java.pessoa.Professor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AplicacaoAlmir {
    public static void main(String[] args) {
        Calendario calendario = new Calendario();
        Emprestimo emprestimo = new Emprestimo();

        List<Aluno> alunos = new ArrayList();
        List<Professor> professores = new ArrayList();
        List<Livro> livros = new ArrayList();

        emprestimo.cadastrarAluno(alunos);
        emprestimo.cadastrarProfessor(professores);
        emprestimo.cadastrarLivro(livros);


        System.out.println("Emprestar Livros:");
        List<Livro> livroSelecionados = new ArrayList<>();
        livroSelecionados.add(livros.get(0));
        livroSelecionados.add(livros.get(3));
        emprestimo.emprestar(professores.get(1), livroSelecionados, LocalDate.of(2021,10,03), calendario);
        emprestimo.emprestar(professores.get(3), livroSelecionados, LocalDate.of(2021,10,01), calendario);

        emprestimo.status(alunos, professores);

        System.out.println("Devolver Livros:");
        emprestimo.devolver(professores.get(1),LocalDate.of(2021,10,10),calendario);
        emprestimo.devolver(alunos.get(3),LocalDate.of(2021,10,20),calendario);

        emprestimo.status(alunos, professores);

    }
}
