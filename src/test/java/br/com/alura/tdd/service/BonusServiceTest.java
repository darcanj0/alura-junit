package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.test_util.TestUtils;

public class BonusServiceTest {
        private BonusService service = new BonusService();

        @Test
        void shouldCancelBonusOnHighSalary() {
                assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(
                                TestUtils.mockFunci("50000")));
        }

        @Test
        void shouldReceiveTenPercent() {
                BigDecimal bonus = service.calcularBonus(TestUtils.mockFunci("3000"));
                assertEquals(
                                TestUtils.toRounded(300),
                                TestUtils.toRounded(bonus));
        }

        @Test
        void shouldReceiveInLimitSalary() {
                BigDecimal bonus = service.calcularBonus(TestUtils.mockFunci("10000"));
                assertEquals(
                                TestUtils.toRounded(1000),
                                TestUtils.toRounded(bonus));
        }
}
