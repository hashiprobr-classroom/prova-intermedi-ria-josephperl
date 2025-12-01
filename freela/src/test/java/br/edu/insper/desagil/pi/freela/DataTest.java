package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {
    private Data d;
    @BeforeEach
    public void setUp(){
        d=new Data();
    }
    @Test
    public void constroi(){
        assertEquals(1,d.getDia());
        assertEquals(1,d.getMes());
        assertEquals(1970,d.getAno());
        assertEquals(0,d.minutos());
    }
    @Test
    public void dataBaixa(){
        d.atualiza(0,0,1969);
        assertEquals(1,d.getDia());
        assertEquals(1,d.getMes());
        assertEquals(1970,d.getAno());
        assertEquals(0,d.minutos());
    }
    @Test
    public void dataAlta(){
        d.atualiza(32,13,2071);
        assertEquals(31,d.getDia());
        assertEquals(12,d.getMes());
        assertEquals(2070,d.getAno());
        assertEquals(53084160,d.minutos());
    }
}
