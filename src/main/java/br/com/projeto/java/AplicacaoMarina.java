package br.com.projeto.java;

import br.com.projeto.java.biblioteca.Livro;
import br.com.projeto.java.pessoa.Aluno;
import br.com.projeto.java.pessoa.Professor;

import java.util.ArrayList;

import static br.com.projeto.java.AplicacaoAlmir.*;

public class AplicacaoMarina {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList();
        ArrayList<Professor> professores = new ArrayList();
        ArrayList<Livro> livros = new ArrayList();

        listaAlunos(alunos);
        listaProfessores(professores);
        listaLivros(livros);

        Status status1 = new Status();
        status1.chamarStatus(alunos, professores, livros);
    }

}





