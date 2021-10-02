package br.com.projeto.java.pessoa;

import lombok.*;

import java.time.LocalDate;

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
}
