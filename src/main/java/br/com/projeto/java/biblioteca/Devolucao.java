package br.com.projeto.java.biblioteca;

import br.com.projeto.java.pessoa.*;

import java.time.LocalDate;

public class Devolucao {

    public void devolver(Pessoa pessoa, LocalDate data, Calendario calendario) {
            pessoa.setDataBloqueio(null);
            pessoa.setQtdDiasBloqueados(0);
            pessoa.setLivros(null);
            pessoa.setQtdLivrosEmprestados(0);
            int diasAtraso = calendario.calcularAtraso(pessoa.getDataDevolucao(), data);

            if (diasAtraso > 0) {
                pessoa.setQtdDiasBloqueados(diasAtraso);
                pessoa.setDataBloqueio(data.plusDays(diasAtraso));
            }
            pessoa.setDataDevolucao(null);
            pessoa.setDataEmprestimo(null);


    }
}
