package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.CalculadoraCientifica;
    
public class CalculadoraCientificaTest {

    @Test
    public void testElevado() {
        CalculadoraCientifica calculadora = new CalculadoraCientifica();
        double resultado = calculadora.elevado(2.0, 3.0);
        assertEquals(10.0, resultado, 0.01);
    }
}
    