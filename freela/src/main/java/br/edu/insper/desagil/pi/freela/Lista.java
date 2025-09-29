package br.edu.insper.desagil.pi.freela;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Tarefa>lista;
    public Lista(){
        this.lista= new ArrayList<>();
    }
    public void adiciona(Tarefa tarefa){
        int identificador= tarefa.getIdentificador();
        lista.add(tarefa);


    }
    public List<Tarefa>getLista(){return lista;}
}
