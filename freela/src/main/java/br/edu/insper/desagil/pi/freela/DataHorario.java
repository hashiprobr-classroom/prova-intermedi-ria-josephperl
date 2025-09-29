package br.edu.insper.desagil.pi.freela;

import java.time.LocalDate;
import java.time.Month;

public class DataHorario extends Momento {
    private int hora;
    private int minuto;
    private LocalDate data;
    public DataHorario(LocalDate data){
        this.hora=0;
        this.minuto=0;
        this.data=data;
    }
    public int getHora(){return hora;}
    public int getMinuto(){return minuto;}
    public LocalDate getData(){return data;}
    public void setData(LocalDate data){this.data=data;}
    public void atualiza(int hora,int minuto){
        if(hora>0 && hora<=23){
            this.hora=hora;
        }
        else{
            this.hora=super.ajusta(hora,0,12);
        }
        if(minuto>0 && minuto<=59){
            this.minuto=minuto;
        }
        else{
            this.minuto=super.ajusta(minuto,0,59);
        }
    }
    @Override
    public int minutos(){
         int x=0;
         return x;


    }

}
