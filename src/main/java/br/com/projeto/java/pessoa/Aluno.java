package br.com.projeto.java.pessoa;

import br.com.projeto.java.biblioteca.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@NoArgsConstructor

public class Aluno extends Pessoa {
    public static final int QTD_LIVROS = 3;
    public static final int DIAS_UTEIS = 10;

    public Aluno(String nome, int matricula, String email, LocalDate dataEmprestimo, LocalDate dataDevolucao, LocalDate dataBloqueio, int qtdDiasBloqueados, int qtdLivrosEmprestados, List<Livro> livros) {
        super(nome, matricula, email, dataEmprestimo, dataDevolucao, dataBloqueio, qtdDiasBloqueados, qtdLivrosEmprestados, livros);

    }

    public Aluno(String nome, int matricula, String email) {
        super(nome, matricula, email, null, null, null, 0, 0, null);

    }
}

