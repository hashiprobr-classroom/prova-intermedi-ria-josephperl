package br.edu.insper.desagil.pi.freela;

import java.util.HashMap;
import java.util.Map;

public class Data extends Momento{
    private int ano;
    private int mes;
    private int dia;
    private Map<Integer, Integer> limite = new HashMap<>();
    public Data(){
        this.ano=1970;
        this.mes=1;
        this.dia=1;
        Map<Integer, Integer> limite = new HashMap<>();
        limite.put(1, 31);
        limite.put(2, 28);
        limite.put(3, 31);
        limite.put(4, 30);
        limite.put(5, 31);
        limite.put(6, 30);
        limite.put(7, 31);
        limite.put(8, 31);
        limite.put(9, 30);
        limite.put(10, 31);
        limite.put(11, 30);
        limite.put(12, 31);
        this.limite = limite;

    }
    public int getAno(){
        return ano;
    }
    public int getMes(){
        return mes;
    }
    public int getDia(){
        return dia;
    }
    public void atualiza(int novoAno,int novoMes, int novoDia){
        if(novoAno>1970 && novoAno<2070){
            this.ano=novoAno;
        }
        else{
            this.ano=super.ajusta(ano,1970,2070);
        }
        if(novoMes>1 && novoMes<12){
            this.mes=novoMes;
        }
        else{
            this.mes=super.ajusta(mes,1,12);
        }

        if(novoDia>1 && novoDia<limite.get(mes)){
            this.dia= novoDia;

        }
        else{
            this.dia= super.ajusta(dia,1,limite.get(mes));
        }
    }
    @Override
    public int minutos(){
        int totalMinuto=0;
         for(int n=1970;n<=this.ano;n++){
             totalMinuto+=365*24*60;
         }
         int totalDias=0;
         for(int n=1;n<=this.mes;n++){
             totalDias+=limite.get(n);
         }
         totalMinuto+=totalDias*24*60;
         return totalMinuto;

    }

}
