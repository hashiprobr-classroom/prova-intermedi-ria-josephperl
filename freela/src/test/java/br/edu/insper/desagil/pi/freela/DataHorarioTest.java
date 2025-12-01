package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataHorarioTest {
    private DataHorario d;
    @BeforeEach
    public void setUp(){
        Data data= new Data();
        d= new DataHorario(data);
    }
    @Test
    public void constroi(){
        assertEquals(0,d.getHora());
        assertEquals(0,d.getMinuto());
        assertEquals(0,d.minutos());
    }
    @Test
    public void horarioBaixo(){
        d.atualiza(-1,-1);
        assertEquals(0,d.getHora());
        assertEquals(0,d.getMinuto());
        assertEquals(0,d.minutos());
    }
    @Test
    public void horarioAlto(){
        d.atualiza(24,60);
        assertEquals(23,d.getHora());
        assertEquals(59,d.getMinuto());
        assertEquals(1439,d.minutos());
    }
}
