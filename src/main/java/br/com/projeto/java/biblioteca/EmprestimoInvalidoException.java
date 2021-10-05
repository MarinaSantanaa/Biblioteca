package br.com.projeto.java.biblioteca;

public class EmprestimoInvalidoException extends Exception{
    public EmprestimoInvalidoException(){
        super("Não é possivel realizar o emprestimo no momento.");
    }
}
