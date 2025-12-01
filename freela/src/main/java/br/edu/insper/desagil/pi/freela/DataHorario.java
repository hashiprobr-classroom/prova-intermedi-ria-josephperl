package br.edu.insper.desagil.pi.freela;

public class DataHorario extends Momento{
    private Data data;
    private int hora;
    private int minuto;
    public DataHorario(Data data){
        this.data=data;
        this.hora=0;
        this.minuto=0;
    }
    public int getHora(){return hora;}
    public int getMinuto(){return minuto;}
    public Data getData(){return data;}
    public void setData(Data data){this.data=data;}

    public void atualiza(int a ,int b){}
    @Override
    public int minutos(){return 0;}



}
