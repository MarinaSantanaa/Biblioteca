package br.com.projeto.java;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public abstract class Pessoa {
    private String nome;
    private String matricula;
    private String email;
}
