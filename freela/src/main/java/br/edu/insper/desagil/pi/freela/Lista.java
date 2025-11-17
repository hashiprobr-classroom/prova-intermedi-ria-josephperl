package br.edu.insper.desagil.pi.freela;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Tarefa> tarefas;
    public Lista(){
        this.tarefas=new ArrayList<>();
    }
    public  List<Tarefa> getTarefas(){return tarefas;}

    public void adiciona(Tarefa tarefa){
        int identificador=tarefa.getIdentificador();
        for(Tarefa t: tarefas){
            if(identificador==t.getIdentificador()){
                return;
            }
        }
        tarefas.add(tarefa);

    }
}
