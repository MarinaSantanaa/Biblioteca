package br.com.projeto.java;

import br.com.projeto.java.biblioteca.*;
import br.com.projeto.java.pessoa.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AplicacaoAlmir {
    public static void main(String[] args) {
        Calendario calendario = new Calendario();
        List<Aluno> alunos = new ArrayList();
        List<Professor> professores = new ArrayList();
        List<Livro> livros = new ArrayList();
        listaAlunos(alunos);
        //exibirAlunos(alunos);
        listaProfessores(professores);
        listaLivros(livros);





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

    private static List listaProfessores(List<Professor> professores) {
        professores.add(new Professor("Maria","1","maria@grupoam.com",null,null,null,0,0));
        professores.add(new Professor("João","1","joao@grupoam.com", LocalDate.of(2021,10,01),LocalDate.of(2021,10,10),LocalDate.of(2021,10,13),3,0));
        professores.add(new Professor("Pedro","1","pedro@grupoam.com",null,null,null,0,0));
        professores.add(new Professor("Marina","1","marina@grupoam.com",LocalDate.of(2021,9,25),LocalDate.of(2021,10,5),null,0,5));
        professores.add(new Professor("Alexandre","1","alexandre@grupoam.com",null,null,null,0,0));
        professores.add(new Professor("Adan","1","adan@grupoam.com",LocalDate.of(2021,9,20),LocalDate.of(2021,10,01),LocalDate.of(2021,10,5),5,0));
        professores.add(new Professor("Ana","1","ana@grupoam.com",null,null,null,0,0));
        professores.add(new Professor("Antonio","1","antonio@grupoam.com",null,null,null,0,0));
        professores.add(new Professor("José","1","jose@grupoam.com",LocalDate.of(2021,10,01),LocalDate.of(2021,10,13),null,0,2));
        professores.add(new Professor("Joana","1","joana@grupoam.com",null,null,null,0,0));
        return professores;
    }

    private static void exibirAlunos(List<Aluno> alunos) {
        for(Aluno aluno : alunos){
            System.out.println(aluno);
        }
    }

    public static List listaAlunos(List alunos){
        alunos.add(new Aluno("Maria","1","maria@grupoam.com",null,null,null,0,0));
        alunos.add(new Aluno("João","1","joao@grupoam.com", LocalDate.of(2021,10,01),LocalDate.of(2021,10,10),LocalDate.of(2021,10,13),3,0));
        alunos.add(new Aluno("Pedro","1","pedro@grupoam.com",null,null,null,0,0));
        alunos.add(new Aluno("Marina","1","marina@grupoam.com",LocalDate.of(2021,9,25),LocalDate.of(2021,10,5),null,0,1));
        alunos.add(new Aluno("Alexandre","1","alexandre@grupoam.com",null,null,null,0,0));
        alunos.add(new Aluno("Adan","1","adan@grupoam.com",LocalDate.of(2021,9,20),LocalDate.of(2021,10,01),LocalDate.of(2021,10,5),5,0));
        alunos.add(new Aluno("Ana","1","ana@grupoam.com",null,null,null,0,0));
        alunos.add(new Aluno("Antonio","1","antonio@grupoam.com",null,null,null,0,0));
        alunos.add(new Aluno("José","1","jose@grupoam.com",LocalDate.of(2021,10,01),LocalDate.of(2021,10,13),null,0,3));
        alunos.add(new Aluno("Joana","1","joana@grupoam.com",null,null,null,0,0));
        return alunos;
    }
}
