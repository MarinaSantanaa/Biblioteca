package br.com.projeto.java.biblioteca;

import lombok.Value;

import java.time.LocalDate;
import java.util.*;

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
        this.feriados.add(LocalDate.parse("2021-10-20"));
        this.feriados.add(LocalDate.parse("2021-10-18"));
        this.feriados.add(LocalDate.parse("2021-11-30"));
        Collections.sort(this.feriados);
    }

    public LocalDate proximoFeriado(LocalDate dataInformada){
        for(int i=0; i<feriados.size(); i++){
            if(dataInformada.isEqual(feriados.get(i)) || dataInformada.isBefore(feriados.get(i))){
                return feriados.get(i);
            }
        }
        return feriados.get(0);
    }

    // Retorna quantidade de dias uteis
    public int calcularDiasUteis(int dias, LocalDate dataInicio){
        int contador = 0;
        LocalDate proximoFeriado = proximoFeriado(dataInicio);
        LocalDate proximaData = dataInicio;

        while(contador < dias){
            if(proximaData.equals(proximoFeriado) ||
                    proximaData.getDayOfWeek().getValue() == 6 ||
                    proximaData.getDayOfWeek().getValue() == 7){
                if(proximaData.equals(proximoFeriado)){
                    proximoFeriado = proximoFeriado(proximaData);
                }
                dias++;
            }
            contador++;
            proximaData = proximaData.plusDays(1);
        }
        return confirmacaoUltimoDia(dataInicio, contador);
    }

    // Retorna a quantidade de dias uteis entre datas
    public int calcularAtraso(LocalDate dataInicio, LocalDate dataFim){
        int contador = 0;
        LocalDate proximoFeriado = proximoFeriado(dataInicio);
        LocalDate proximaData = dataInicio;

        while(!proximaData.equals(dataFim)){
            if(proximaData.equals(proximoFeriado) ||
                    proximaData.getDayOfWeek().getValue() == 6 ||
                    proximaData.getDayOfWeek().getValue() == 7){
                if(proximaData.equals(proximoFeriado)){
                    proximoFeriado = proximoFeriado(proximaData);
                }
            } else {
                contador++;
            }
            proximaData = proximaData.plusDays(1);
        }
        return confirmacaoUltimoDia(dataInicio, contador);
    }

    private int confirmacaoUltimoDia(LocalDate dataInicio, int contador){
        if(dataInicio.plusDays(contador).getDayOfWeek().getValue() == 6){
            contador = contador + 2;
        } else if (dataInicio.plusDays(contador).getDayOfWeek().getValue() == 7){
            contador++;
        }
        return contador;
    }

}
