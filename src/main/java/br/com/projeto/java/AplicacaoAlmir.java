package br.com.projeto.java;

import br.com.projeto.java.biblioteca.*;

import java.time.LocalDate;

public class AplicacaoAlmir {
    public static void main(String[] args) {
        Calendario calendario = new Calendario();

        //System.out.println(calendario.proximoFeriado(informado));
        LocalDate informado = LocalDate.parse("2021-10-01");
        System.out.println("inicio: " +informado);
        int contador = calendario.calcularDiasUteis(10, informado);
        System.out.println("numero de vezes: " + contador);
        System.out.println("fim: "+ informado.plusDays(contador));


        //contador = calendario.calcularAtraso(informado, LocalDate.parse("2021-10-10"));
        //System.out.println("contador: "+ contador);





        int dias = 0;


       // int contador = 0;
//        while(contador != dias){
//            LocalDate diaMaisUm = informado.plusDays(1);
//           // if()
//
//        }


        //calendario.calcularAtraso(hoje, hoje);


    }
}
