package br.com.alura.tdd.modelo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import br.com.alura.tdd.modelo.Calculadora;

public class CalculadoraTest {
    @Test
    public void shouldSumTwoPositives() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3, 7);
        Assertions.assertEquals(10, soma);
    }
}
