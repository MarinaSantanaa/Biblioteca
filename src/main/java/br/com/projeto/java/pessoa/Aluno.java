package br.com.projeto.java.pessoa;
import br.com.projeto.java.biblioteca.*;
import java.time.LocalDate;
import java.util.List;

public class Aluno extends Pessoa {
    public static final int QTD_LIVROS = 3;
    public static final int DIAS_UTEIS = 10;

    public Aluno(String nome, String matricula, String email, LocalDate dataEmprestimo, LocalDate dataDevolucao, LocalDate dataBloqueio, int qtdDiasBloqueados, int qtdLivrosEmprestados, List<Livro> livros) {
        super(nome, matricula, email, dataEmprestimo, dataDevolucao, dataBloqueio, qtdDiasBloqueados, qtdLivrosEmprestados, livros);
    }
}
