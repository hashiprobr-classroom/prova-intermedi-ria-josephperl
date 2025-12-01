package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class TarefaTest {
    private Data datafalsa(int ano,int mes , int dia){
        Data data = mock(Data.class);
        when(data.getAno()).thenReturn(ano);
        when(data.getMes()).thenReturn(mes);
        when(data.getDia()).thenReturn(dia);
        return data;
    }
    private Tarefa t;
    @BeforeEach
    public void setUp(){
        t = new Tarefa(2);
    }
    @Test
    public void constroi(){
        assertEquals(2,t.getId());
        assertEquals("",t.getDescricao());
        assertNull(t.getInicio());
        assertNull(t.getFim());
    }
    @Test
    public void mudaDescricao(){
        t.setDescricao("s");
        assertEquals("s",t.getDescricao());
    }
    @Test
    public void momentosValidos(){
        Data inicio=datafalsa(2010,10,10);
        Data fim= datafalsa(2015,1,8);
        t.atualiza(inicio,fim);
        assertSame(inicio,t.getInicio());
        assertSame(fim,t.getFim());
    }
    @Test
    public void momentosInvalidos(){
        Data inicio=datafalsa(2010,10,10);
        Data fim= datafalsa(2015,10,10);
        assertThrows(IllegalArgumentException.class,()->{t.atualiza(fim,inicio);});
    }

}
