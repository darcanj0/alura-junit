package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.test_util.TestUtils;

public class BonusServiceTest {
    @Test
    void shouldCancelBonusOnHighSalary() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario(
                "dan",
                LocalDate.now(),
                new BigDecimal(50000)));
        assertEquals(BigDecimal.ZERO, bonus);
    }

    @Test
    void shouldReceiveTenPercent() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario(
                "dan",
                LocalDate.now(),
                new BigDecimal(3000)));
        assertEquals(
                TestUtils.toRounded(300),
                TestUtils.toRounded(bonus));
    }

    @Test
    void shouldReceiveInLimitSalary() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario(
                "dan",
                LocalDate.now(),
                new BigDecimal(10000)));
        assertEquals(
                TestUtils.toRounded(1000),
                TestUtils.toRounded(bonus));
    }
}
