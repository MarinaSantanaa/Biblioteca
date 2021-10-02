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
        this.feriados.add(LocalDate.parse("2021-11-02"));
        this.feriados.add(LocalDate.parse("2021-10-05"));
        this.feriados.add(LocalDate.parse("2021-10-06"));
        this.feriados.add(LocalDate.parse("2021-10-11"));
        this.feriados.add(LocalDate.parse("2021-11-02"));
        this.feriados.add(LocalDate.parse("2021-10-18"));
        this.feriados.add(LocalDate.parse("2021-11-30"));
        Collections.sort(this.feriados);
    }

    private LocalDate proximoFeriado(LocalDate dataInformada){
        for(LocalDate feriado : feriados){
            if(dataInformada.isEqual(feriado) || dataInformada.isBefore(feriado)){
                System.out.println(feriado);
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
