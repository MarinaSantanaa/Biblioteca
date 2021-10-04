package br.com.projeto.java.biblioteca;

import br.com.projeto.java.pessoa.Aluno;
import br.com.projeto.java.pessoa.Professor;

import java.util.ArrayList;

public interface Biblioteca {

    void emprestar();

    void devolver();

    void bloquear();

    void desbloquear();

    void cadastrarLivro();

    void cadastrarPessoa();

    void status();
}
