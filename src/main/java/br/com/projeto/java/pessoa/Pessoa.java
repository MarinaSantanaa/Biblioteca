package br.com.projeto.java.pessoa;

import lombok.*;
import br.com.projeto.java.biblioteca.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public abstract class Pessoa {
    private String nome;
    private String matricula;
    private String email;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private LocalDate dataBloqueio;
    private int qtdDiasBloqueados;
    private int qtdLivrosEmprestados;
    private List<Livro> livros;
}
