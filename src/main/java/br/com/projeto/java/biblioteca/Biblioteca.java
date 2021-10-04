package br.com.projeto.java.biblioteca;

import br.com.projeto.java.pessoa.Aluno;
import br.com.projeto.java.pessoa.Pessoa;
import br.com.projeto.java.pessoa.Professor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface Biblioteca {

    void emprestar(Pessoa pessoa, List livros, LocalDate dataEmprestimo, Calendario calendario);

    void devolver(Pessoa pessoa, LocalDate data, Calendario calendario);

    void bloquear();

    void desbloquear();

    void cadastrarLivro(List<Livro> livros);

    void cadastrarAluno(List<Aluno> pessoa);

    void cadastrarProfessor(List<Professor> pessoa);

    void status(List<Aluno> alunos, List<Professor> professores);
}
