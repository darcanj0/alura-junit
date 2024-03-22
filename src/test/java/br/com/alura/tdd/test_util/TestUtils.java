package br.com.alura.tdd.test_util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestUtils {
    public static BigDecimal toRounded(Number value) {
        return new BigDecimal(value.doubleValue()).setScale(2, RoundingMode.HALF_UP);
    }
}
