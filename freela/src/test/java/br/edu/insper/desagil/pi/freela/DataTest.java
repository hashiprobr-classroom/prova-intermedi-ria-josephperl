package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {
    private Data data;
    @BeforeEach
    public void setUp(){
        data= new Data();
    }
    @Test
     public void constroi(){
        assertEquals(1,data.getDia());
        assertEquals(1,data.getMes());
        assertEquals(1970,data.getAno());
    }
    @Test
    public void dataBaixa(){
        data.atualiza(0,0,1969);
        assertEquals(1,data.getDia());
        assertEquals(1,data.getMes());
        assertEquals(1970,data.getAno());
        assertEquals(0,data.minutos());
    }
    @Test
    public void dataAlta(){
        data.atualiza(31,13,2070);
        assertEquals(31,data.getDia());
        assertEquals(12,data.getMes());
        assertEquals(2070,data.getAno());
        assertEquals(53084160,data.minutos());
    }


    }






