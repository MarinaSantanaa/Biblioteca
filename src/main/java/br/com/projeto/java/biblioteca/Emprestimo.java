package br.com.projeto.java.biblioteca;

import br.com.projeto.java.pessoa.Aluno;
import br.com.projeto.java.pessoa.Pessoa;
import br.com.projeto.java.pessoa.Professor;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Emprestimo implements Biblioteca {
    Date diaEmprestimo;
    Date diaDevolucao;


    @Override
    public void emprestar() {

    }

    public void emprestar(Pessoa pessoa, List livros, LocalDate dataEmprestimo, Calendario calendario) {

        if(pessoa instanceof Aluno) {
            if (pessoa.getDataDevolucao().equals(null)) {
                if ( pessoa.getQtdLivrosEmprestados() < Aluno.QTD_LIVROS) {
                    Aluno aluno1 = new Aluno();
                    aluno1 = (Aluno) pessoa;
                    aluno1.setDataEmprestimo(dataEmprestimo);
                    int dataDevolucao = calendario.calcularDiasUteis(aluno1.DIAS_UTEIS, dataEmprestimo);
                    aluno1.setDataDevolucao(dataEmprestimo.plusDays(dataDevolucao));
                    aluno1.setLivros(livros);
                    aluno1.setQtdLivrosEmprestados(livros.size());
                } else {
                    System.out.println("Só pode levar 3 livros");
                }
            }
            else {
                System.out.println("Não é possivel realizar um novo emprestimo no momento");
            }

        } else {
            if (pessoa.getDataDevolucao().equals(null)) {
                if ( pessoa.getQtdLivrosEmprestados() < Professor.QTD_LIVROS) {
                    Professor professor1 = new Professor();
                    professor1 = (Professor) pessoa;
                    professor1.setDataEmprestimo(dataEmprestimo);
                    int dataDevolucao = calendario.calcularDiasUteis(professor1.DIAS_UTEIS, dataEmprestimo);
                    professor1.setDataDevolucao(dataEmprestimo.plusDays(dataDevolucao));
                    professor1.setLivros(livros);
                    professor1.setQtdLivrosEmprestados(livros.size());
                } else {
                    System.out.println("Não é possivel realizar um novo emprestimo no momento");}
            } else {
                System.out.println("Não é possivel realizar um novo emprestimo no momento");
            }
        }

    }

    @Override
    public void devolver() {

    }
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
    @Override
    public void bloquear() {

    }

    @Override
    public void desbloquear() {

    }

    @Override
    public void cadastrarLivro() {

    }

    @Override
    public void cadastrarPessoa() {

    }

    @Override
    public void status() {

    }

    public void status(List<Aluno> alunos, List<Professor> professores, List<Livro> livros) {
        System.out.println("\nAlunos ativos: \n");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }

        System.out.println("\nProfessores ativos: \n");
        for (Professor professor : professores) {
            System.out.println(professor.getNome());

        }

        System.out.println("\nLivros ativos: \n");
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());

        }

    }
}