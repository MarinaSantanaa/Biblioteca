package br.com.projeto.java.pessoa;

import br.com.projeto.java.biblioteca.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@NoArgsConstructor

public class Professor extends Pessoa {
    public static final int QTD_LIVROS = 5;
    public static final int DIAS_UTEIS = 20;

    public Professor(String nome, int matricula, String email, LocalDate dataEmprestimo, LocalDate dataDevolucao, LocalDate dataBloqueio, int qtdDiasBloqueados, int qtdLivrosEmprestados, List<Livro> livros) {
        super(nome, matricula, email, dataEmprestimo, dataDevolucao, dataBloqueio, qtdDiasBloqueados, qtdLivrosEmprestados, livros);
    }

    public Professor(String nome, int matricula, String email) {
        super(nome, matricula, email, null, null, null, 0, 0, null);
    }

}
