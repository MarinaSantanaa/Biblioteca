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

        if (pessoa instanceof Aluno) {
            if (pessoa.getDataDevolucao().equals(null)) {
                if (pessoa.getQtdLivrosEmprestados() < Aluno.QTD_LIVROS) {
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
            } else {
                System.out.println("Não é possivel realizar um novo emprestimo no momento");
            }

        } else {
            if (pessoa.getDataDevolucao().equals(null)) {
                if (pessoa.getQtdLivrosEmprestados() < Professor.QTD_LIVROS) {
                    Professor professor1 = new Professor();
                    professor1 = (Professor) pessoa;
                    professor1.setDataEmprestimo(dataEmprestimo);
                    int dataDevolucao = calendario.calcularDiasUteis(professor1.DIAS_UTEIS, dataEmprestimo);
                    professor1.setDataDevolucao(dataEmprestimo.plusDays(dataDevolucao));
                    professor1.setLivros(livros);
                    professor1.setQtdLivrosEmprestados(livros.size());
                } else {
                    System.out.println("Não é possivel realizar um novo emprestimo no momento");
                }
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

    public void cadastrarLivro(List<Livro> livros) {
        livros.add(new Livro(198276, "Linguagem C - Completa e Descomplicada", "Andre Backes", "GEN LTC"));
        livros.add(new Livro(206743, "Introdução à Programação com Python: Algoritmos e Lógica de Programação", "Nilo Ney Coutinho Menezes", "Novatec Editora"));
        livros.add(new Livro(985432, "Código Limpo", "Robert Cecil Martin", "Alta Books"));
        livros.add(new Livro(548201, "Introdução à Linguagem SQL: Abordagem Prática Para Iniciantes", "Thomas Nield", "Novatec Editora"));
        livros.add(new Livro(746734, "Gestão da Inovação", "Joseph Tidd", "Bookman"));
        livros.add(new Livro(723567, "Livro A", "Fulano A", "Editora Independente A"));
        livros.add(new Livro(645190, "Livro B", "Fulano B", "Editora Independente B"));
        livros.add(new Livro(356984, "Livro C", "Fulano C", "Editora Independente C"));
        livros.add(new Livro(587308, "Livro D", "Fulano D", "Editora Independente D"));
        livros.add(new Livro(895432, "Livro E", "Fulano E", "Editora Independente E"));
        livros.add(new Livro(409675, "Livro F", "Fulano F", "Editora Independente F"));
        livros.add(new Livro(196754, "Livro G", "Fulano G", "Editora Independente G"));
        livros.add(new Livro(905631, "Livro H", "Fulano H", "Editora Independente H"));
        livros.add(new Livro(865420, "Livro I", "Fulano I", "Editora Independente I"));
        livros.add(new Livro(146065, "Livro J", "Fulano J", "Editora Independente J"));
        livros.add(new Livro(108954, "Livro K", "Fulano K", "Editora Independente K"));
        livros.add(new Livro(106846, "Livro L", "Fulano L", "Editora Independente L"));
        livros.add(new Livro(759765, "Livro M", "Fulano M", "Editora Independente M"));
        livros.add(new Livro(597865, "Livro N", "Fulano N", "Editora Independente N"));
        livros.add(new Livro(349803, "Livro O", "Fulano O", "Editora Independente O"));
        livros.add(new Livro(497621, "Livro P", "Fulano P", "Editora Independente P"));
        livros.add(new Livro(926732, "Livro Q", "Fulano Q", "Editora Independente Q"));

    }

    public void cadastrarAluno(List<Aluno> pessoa) {
        pessoa.add(new Aluno("Adan Rudieri", 1001, "adanrudieri@grupoAM.com"));
        pessoa.add(new Aluno("Almir Junior", 1002, "almirjunior@grupoAM.com"));
        pessoa.add(new Aluno("Marina Santana", 1003, "marinasantana@grupoAM.com"));
        pessoa.add(new Aluno("Alexandre Santos", 1004, "alexandresantos@grupoAM.com"));
        pessoa.add(new Aluno("Ana Mocelin", 1005, "anamocelin@grupoAM.com"));
        pessoa.add(new Aluno("Antônio Neto", 1006, "antonioneto@grupoAM.com"));
        pessoa.add(new Aluno("Igor Gonçalves", 1007, "igorgoncalves@grupoAM.com"));
        pessoa.add(new Aluno("Pedro Augusto", 1008, "pedroaugusto@grupoAM.com"));
        pessoa.add(new Aluno("Eduarda Lima", 1009, "eduardalima@grupoAM.com"));
        pessoa.add(new Aluno("Maria Cecília", 1010, "mariacecilia@grupoAM.com"));
        pessoa.add(new Aluno("Angela Silva", 1011, "angelasilva@grupoAM.com"));
        pessoa.add(new Aluno("Pamela Ferreira", 1012, "pamelaferreira@grupoAM.com"));
        pessoa.add(new Aluno("Breno Lopes", 1013, "brenolopes@grupoAM.com"));
        pessoa.add(new Aluno("Paloma Ribeiro", 1014, "palomaribeiro@grupoAM.com"));
        pessoa.add(new Aluno("Ricardo Meireles", 1015, "ricardomeireles@grupoAM.com"));
        pessoa.add(new Aluno("Jordana Costa", 1016, "jordanacosta@grupoAM.com"));
        pessoa.add(new Aluno("Luiza Faria", 1017, "luizafaria@grupoAM.com"));
        pessoa.add(new Aluno("Fabiana Andrade", 1018, "fabianaandrade@grupoAM.com"));
        pessoa.add(new Aluno("Poliana Gomes", 1019, "polianagomes@grupoAM.com"));
        pessoa.add(new Aluno("Thiago Gomes", 1020, "thiagogomes@grupoAM.com"));
    }

    public void cadastrarProfessor(List<Professor> pessoa) {
        pessoa.add(new Professor("Jesse Haniel", 7001, "jessehaniel@grupoAM.com"));
        pessoa.add(new Professor("Gabriel Militelo", 7002, "gabrielmilitelo@grupoAM.com"));
        pessoa.add(new Professor("Marco Medeiros", 7003, "marcomedeiros@grupoAM.com"));
        pessoa.add(new Professor("Vinicius Martins", 7004, "viniviusmartins@grupoAM.com"));
        pessoa.add(new Professor("Camila Lobianco", 7005, "camilalobianco@grupoAM.com"));

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