package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListaTest {
    private Lista l;
    private Tarefa tarefafalsa(int id){
        Tarefa tarefa = mock(Tarefa.class);
        when(tarefa.getId()).thenReturn(id);
        return tarefa;
    }
    @BeforeEach
    public void setUp(){
        l=new Lista();
    }
    @Test
    public void constroi(){
        assertEquals(0,l.getTarefas().size());
    }
    @Test
    public void adicionaIguais(){
        l.adiciona(tarefafalsa(1));
        l.adiciona(tarefafalsa(1));
        assertEquals(1,l.getTarefas().size());

    }
    @Test
    public void adicionaDiferentes(){
        l.adiciona(tarefafalsa(1));
        l.adiciona(tarefafalsa(2));
        assertEquals(2,l.getTarefas().size());
    }
}
