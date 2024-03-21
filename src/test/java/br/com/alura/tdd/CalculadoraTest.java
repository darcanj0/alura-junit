package br.com.alura.tdd;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Calculadora;

public class CalculadoraTest {
    @Test
    public void shouldSumTwoPositives() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3, 7);
    }
}
