package br.com.projeto.java.biblioteca;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Livro {
        private String isbn;
        private String titulo;
        private String autor;
        private String editora;
}
