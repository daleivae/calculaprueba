import org.junit.Test;

import main.java.CalculadoraCientifica;

import static org.junit.Assert.assertEquals;
    
public class CalculadoraCientificaTest {

    @Test
    public void testElevado() {
        CalculadoraCientifica calculadora = new CalculadoraCientifica();
        double resultado = calculadora.elevado(2.0, 3.0);
        assertEquals(8.0, resultado, 0.01);
    }
}
    