package br.com.projeto.java.biblioteca;

import lombok.Value;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;
@Value

public class Calendario{
    private List<LocalDate> feriados;

    public Calendario(){
        feriados = new ArrayList<LocalDate>();
        listaFeriados();
    }

    private void listaFeriados(){
        feriados.add(LocalDate.of(2021, 1, 1));
        feriados.add(LocalDate.of(2021, 4, 2));
        feriados.add(LocalDate.of(2021, 4, 21));
        feriados.add(LocalDate.of(2021, 5, 1));
        feriados.add(LocalDate.of(2021, 9, 7));
        feriados.add(LocalDate.of(2021, 10, 12));
        feriados.add(LocalDate.of(2021, 11, 2));
        feriados.add(LocalDate.of(2021, 11, 15));
        feriados.add(LocalDate.of(2021, 12, 25));
    }

    private LocalDate proximoFeriado(LocalDate dataInformada){
        for(LocalDate feriado : feriados){
            if(dataInformada.isEqual(feriado) || dataInformada.isBefore(feriado)){
                return feriado;
            }
        }
        return feriados.get(0);
    }

    public int calcularDiasUteis(int dias, LocalDate data){
        LocalDate feriado = proximoFeriado(data);
        int contador = 1;

        while(contador < dias){
            data = data.plusDays(1);
            if(!isDiaUtil(data, feriado)){
                if(data.isEqual(feriado)){
                    feriado = proximoFeriado(data.plusDays(1));
                }
                dias++;
            }
            contador++;
        }
        return confirmacaoUltimoDia(data, contador);
    }

    public int calcularAtraso(LocalDate dataInicio, LocalDate dataFim){
        int contador = 0;
        LocalDate feriado = proximoFeriado(dataInicio);
        LocalDate data = dataInicio;

        while(!data.isEqual(dataFim)){
            data = data.plusDays(1);
            if(!isDiaUtil(data, feriado)){
                if(data.equals(feriado)){
                    feriado = proximoFeriado(data.plusDays(1));
                }
            } else {
                contador++;
            }
        }
        return contador;
    }

    private boolean isDiaUtil(LocalDate data, LocalDate feriado){
        DayOfWeek diaSemana = data.getDayOfWeek();
        return !(data.isEqual(feriado) ||
                SATURDAY.equals(diaSemana) ||
                SUNDAY.equals(diaSemana));
    }

    private int confirmacaoUltimoDia(LocalDate dataInicio, int contador){
        DayOfWeek diaSemana = dataInicio.plusDays(contador).getDayOfWeek();
        if(SATURDAY.equals(diaSemana)){
            contador = contador + 2;
        } else if (SUNDAY.equals(diaSemana)){
            contador++;
        }
        return contador;
    }
}
