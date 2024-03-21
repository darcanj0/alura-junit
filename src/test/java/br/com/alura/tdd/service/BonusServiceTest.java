package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

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
                new BigDecimal(300).setScale(2, RoundingMode.HALF_UP),
                bonus.setScale(2, RoundingMode.HALF_UP));
    }
}
