package br.com.alura.tdd.test_util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import br.com.alura.tdd.modelo.Funcionario;

public class TestUtils {
    public static BigDecimal toRounded(Number value) {
        return new BigDecimal(value.doubleValue()).setScale(2, RoundingMode.HALF_UP);
    }

    public static Funcionario mockFunci(String salary) {
        return new Funcionario("dan",
                LocalDate.now(),
                new BigDecimal(salary));
    }
}
