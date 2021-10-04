package br.com.projeto.java;

import br.com.projeto.java.biblioteca.Calendario;
import br.com.projeto.java.biblioteca.Emprestimo;
import br.com.projeto.java.biblioteca.Livro;
import br.com.projeto.java.pessoa.Aluno;
import br.com.projeto.java.pessoa.Professor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AplicacaoAlmir {
    public static void main(String[] args) {
        Calendario calendario = new Calendario();
        Emprestimo emprestimo = new Emprestimo();

        List<Aluno> alunos = new ArrayList();
        List<Professor> professores = new ArrayList();
        List<Livro> livros = new ArrayList();

        //Cadastro previo
        alunos = listaAlunos(alunos);
        professores = listaProfessores(professores);
        livros = listaLivros(livros);

        emprestimo.cadastrarAluno(alunos);
        emprestimo.cadastrarProfessor(professores);
        emprestimo.cadastrarLivro(livros);


        System.out.println("====================================================== Emprestar Livros:");
        List<Livro> livroSelecionados = new ArrayList<>();
        livroSelecionados.add(livros.get(0));
        livroSelecionados.add(livros.get(3));
        emprestimo.emprestar(professores.get(0), livroSelecionados, LocalDate.of(2021,10,03), calendario);
        emprestimo.emprestar(professores.get(2), livroSelecionados, LocalDate.of(2021,10,01), calendario);
        emprestimo.emprestar(professores.get(6), livroSelecionados, LocalDate.of(2021,10,01), calendario);
        emprestimo.emprestar(alunos.get(5), livroSelecionados, LocalDate.of(2021,10,01), calendario);
        emprestimo.emprestar(alunos.get(6), livroSelecionados, LocalDate.of(2021,10,01), calendario);
        emprestimo.emprestar(alunos.get(7), livroSelecionados, LocalDate.of(2021,10,05), calendario);
        emprestimo.emprestar(alunos.get(8), livroSelecionados, LocalDate.of(2021,10,01), calendario);
        emprestimo.status(alunos, professores);

        System.out.println("====================================================== Emprestar Novamente:");

        // Emprestar novamente
        emprestimo.emprestar(alunos.get(5), livroSelecionados, LocalDate.of(2021,10,01), calendario);
        emprestimo.emprestar(alunos.get(6), livroSelecionados, LocalDate.of(2021,10,01), calendario);
        emprestimo.emprestar(professores.get(2), livroSelecionados, LocalDate.of(2021,10,01), calendario);
        emprestimo.emprestar(professores.get(6), livroSelecionados, LocalDate.of(2021,10,01), calendario);
        emprestimo.status(alunos, professores);

        System.out.println("====================================================== Devolver Livros:");
        emprestimo.devolver(professores.get(2),LocalDate.of(2021,10,10),calendario);
        emprestimo.devolver(professores.get(6),LocalDate.of(2021,10,18),calendario);
        emprestimo.devolver(alunos.get(5),LocalDate.of(2021,10,10),calendario);
        emprestimo.devolver(alunos.get(6),LocalDate.of(2021,10,20),calendario);
        emprestimo.status(alunos, professores);


    }

    private static List listaLivros(List<Livro> livros) {
        livros.add(new Livro(123,"Livro Um", "Autor do Livro 1", "GrupoAM"));
        livros.add(new Livro(456,"Livro Dois", "Autor do Livro 2", "GrupoAM"));
        livros.add(new Livro(789,"Livro Tres", "Autor do Livro 3", "GrupoAM"));
        livros.add(new Livro(741,"Livro Quatro", "Autor do Livro 4", "GrupoAM"));
        return livros;
    }

    private static List listaProfessores(List<Professor> professores) {
        professores.add(new Professor("Maria",1,"maria@grupoam.com",null,null,null,0,0, null));
        professores.add(new Professor("João",1,"joao@grupoam.com", LocalDate.of(2021,10,01),LocalDate.of(2021,10,10),LocalDate.of(2021,10,13),3,0, null));
        professores.add(new Professor("Pedro",1,"pedro@grupoam.com",null,null,null,0,0, null));
        professores.add(new Professor("Joana",1,"joana@grupoam.com",null,null,null,0,0, null));
        return professores;
    }

    private static void exibirAlunos(List<Aluno> alunos) {
        for(Aluno aluno : alunos){
            System.out.println(aluno);
        }
    }

    public static List listaAlunos(List alunos){
        alunos.add(new Aluno("Maria",1,"maria@grupoam.com",null,null,null,0,0, null));
        alunos.add(new Aluno("João",1,"joao@grupoam.com", LocalDate.of(2021,10,01),LocalDate.of(2021,10,10),LocalDate.of(2021,10,13),3,0, null));
        alunos.add(new Aluno("Pedro",1,"pedro@grupoam.com",null,null,null,0,0, null));
        alunos.add(new Aluno("Marina",1,"marina@grupoam.com",LocalDate.of(2021,9,25),LocalDate.of(2021,10,5),null,0,1, new ArrayList<>()));
       return alunos;
    }
}
