package br.com.projeto.java;

import br.com.projeto.java.biblioteca.*;
import br.com.projeto.java.pessoa.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AplicacaoNeto {
    public static void main(String[] args) {
        Calendario calendario = new Calendario();
        List<Aluno> alunos = new ArrayList();
        List<Professor> professores = new ArrayList();
        List<Livro> livros = new ArrayList();

        listaAlunos(alunos);
        //exibirAlunos(alunos);
        listaProfessores(professores);
        listaLivros(livros);
        List<Livro> livroSelecionados = new ArrayList<>();
        livroSelecionados.add(livros.get(0));
        livroSelecionados.add(livros.get(3));
    emprestar(professores.get(1), livroSelecionados, LocalDate.of(2021,10,03), calendario);
       exibirProfessores(professores);


    }

    public static void emprestar(Pessoa pessoa, List livros, LocalDate dataEmprestimo, Calendario calendario) {

        if(pessoa instanceof Aluno) {
            Aluno aluno1 = new Aluno();
            aluno1 = (Aluno) pessoa;
            aluno1.setDataEmprestimo(dataEmprestimo);
           int dataDevolucao = calendario.calcularDiasUteis(aluno1.DIAS_UTEIS, dataEmprestimo);
           aluno1.setDataDevolucao(dataEmprestimo.plusDays(dataDevolucao));
           aluno1.setLivros(livros);
           aluno1.setQtdLivrosEmprestados(livros.size());
        } else {
            Professor professor1 = new Professor();
            professor1 = (Professor) pessoa;
            professor1.setDataEmprestimo(dataEmprestimo);
            int dataDevolucao = calendario.calcularDiasUteis(professor1.DIAS_UTEIS, dataEmprestimo);
            professor1.setDataDevolucao(dataEmprestimo.plusDays(dataDevolucao));
            professor1.setLivros(livros);
            professor1.setQtdLivrosEmprestados(livros.size());
        }



    }

    private static List listaLivros(List<Livro> livros) {
        livros.add(new Livro("123","Livro Um", "Autor do Livro 1", "GrupoAM"));
        livros.add(new Livro("456","Livro Dois", "Autor do Livro 2", "GrupoAM"));
        livros.add(new Livro("789","Livro Tres", "Autor do Livro 3", "GrupoAM"));
        livros.add(new Livro("741","Livro Quatro", "Autor do Livro 4", "GrupoAM"));
        livros.add(new Livro("852","Livro Cinco", "Autor do Livro 5", "GrupoAM"));
        livros.add(new Livro("963","Livro Seis", "Autor do Livro 6", "GrupoAM"));
        livros.add(new Livro("321","Livro Sete", "Autor do Livro 7", "GrupoAM"));
        livros.add(new Livro("654","Livro Oito", "Autor do Livro 8", "GrupoAM"));
        livros.add(new Livro("987","Livro Nove", "Autor do Livro 9", "GrupoAM"));
        livros.add(new Livro("147","Livro Dez", "Autor do Livro 10", "GrupoAM"));
        return livros;
    }

    private static void exibirProfessores(List<Professor> professores) {
        for (Professor professor : professores) {
            System.out.println(professor);
        }
    }
    private static List listaProfessores(List<Professor> professores) {
        professores.add(new Professor("Maria","1","maria@grupoam.com",null,null,null,0,0, null));
        professores.add(new Professor("João","1","joao@grupoam.com", LocalDate.of(2021,10,01),LocalDate.of(2021,10,10),LocalDate.of(2021,10,13),3,0, null));
        professores.add(new Professor("Pedro","1","pedro@grupoam.com",null,null,null,0,0, null));
        professores.add(new Professor("Marina","1","marina@grupoam.com",LocalDate.of(2021,9,25),LocalDate.of(2021,10,5),null,0,5, new ArrayList<>()));
        professores.add(new Professor("Alexandre","1","alexandre@grupoam.com",null,null,null,0,0, null));
        professores.add(new Professor("Adan","1","adan@grupoam.com",LocalDate.of(2021,9,20),LocalDate.of(2021,10,01),LocalDate.of(2021,10,5),5,0, null));
        professores.add(new Professor("Ana","1","ana@grupoam.com",null,null,null,0,0, null));
        professores.add(new Professor("Antonio","1","antonio@grupoam.com",null,null,null,0,0, null));
        professores.add(new Professor("José","1","jose@grupoam.com",LocalDate.of(2021,10,01),LocalDate.of(2021,10,13),null,0,2, new ArrayList<>()));
        professores.add(new Professor("Joana","1","joana@grupoam.com",null,null,null,0,0, null));
        return professores;
    }

    private static void exibirAlunos(List<Aluno> alunos) {
        for(Aluno aluno : alunos){
            System.out.println(aluno);
        }
    }

    public static List listaAlunos(List alunos){
        alunos.add(new Aluno("Maria","1","maria@grupoam.com",null,null,null,0,0, null));
        alunos.add(new Aluno("João","1","joao@grupoam.com", LocalDate.of(2021,10,01),LocalDate.of(2021,10,10),LocalDate.of(2021,10,13),3,0, null));
        alunos.add(new Aluno("Pedro","1","pedro@grupoam.com",null,null,null,0,0, null));
        alunos.add(new Aluno("Marina","1","marina@grupoam.com",LocalDate.of(2021,9,25),LocalDate.of(2021,10,5),null,0,1, new ArrayList<>()));
        alunos.add(new Aluno("Alexandre","1","alexandre@grupoam.com",null,null,null,0,0, null));
        alunos.add(new Aluno("Adan","1","adan@grupoam.com",LocalDate.of(2021,9,20),LocalDate.of(2021,10,01),LocalDate.of(2021,10,5),5,0, null));
        alunos.add(new Aluno("Ana","1","ana@grupoam.com",null,null,null,0,0, null));
        alunos.add(new Aluno("Antonio","1","antonio@grupoam.com",null,null,null,0,0, null));
        alunos.add(new Aluno("José","1","jose@grupoam.com",LocalDate.of(2021,10,01),LocalDate.of(2021,10,13),null,0,3, new ArrayList<>()));
        alunos.add(new Aluno("Joana","1","joana@grupoam.com",null,null,null,0,0, null));
        return alunos;
    }
}
