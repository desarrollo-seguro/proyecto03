package es.santander.ascender.proyecto03;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testPresentarTablaMultiplicar() {
        Calculadora calculadora = new Calculadora();

        calculadora.presentarTablaMultiplicar(6);
    }
}
