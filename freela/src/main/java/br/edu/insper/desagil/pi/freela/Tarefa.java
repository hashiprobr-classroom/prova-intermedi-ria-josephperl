package br.edu.insper.desagil.pi.freela;

public class Tarefa {
    private int identificador;
    private String descricao;
    private Momento inicio;
    private Momento fim;
    public Tarefa(int identificador){
        this.identificador=identificador;
        this.descricao="";
        this.inicio=null;
        this.fim=null;
    }
    public int getIdentificador(){return identificador;}
    public String getDescricao(){return descricao;}
    public void setDescricao(String descricao){this.descricao=descricao;}
    public Momento getInicio(){return inicio;}
    public Momento getFim(){return fim;}

    public void atualiza(Momento inicio,Momento fim){
        if(inicio.minutos()>fim.minutos()){
            throw new IllegalArgumentException("erro");
        }
        else{
            this.inicio=inicio;
            this.fim=fim;
        }
    }


}
