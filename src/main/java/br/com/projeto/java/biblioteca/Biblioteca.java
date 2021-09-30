package br.com.projeto.java.biblioteca;

public interface Biblioteca {
    void emprestar();

    void devolver();

    void bloquear();

    void desbloquear();

    void cadastrarLivro();

    void cadastrarPessoa();

    void status();
}
