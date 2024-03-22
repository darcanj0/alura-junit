package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.Performance;
import br.com.alura.tdd.test_util.TestUtils;

public class ReadjustServiceTest {
    private ReadjustService service = new ReadjustService();

    @Test
    public void shouldCalcForBadPerformance() {
        Funcionario funci = TestUtils.mockFunci("1000");
        service.getReadjustFor(funci, Performance.BAD);
        assertEquals(
                TestUtils.toRounded(new BigDecimal("1030.00")),
                TestUtils.toRounded(funci.getSalario()));

    }

    @Test
    public void shouldCalcForMidPerformance() {
        Funcionario funci = TestUtils.mockFunci("1000");
        service.getReadjustFor(funci, Performance.MID);
        assertEquals(
                TestUtils.toRounded(new BigDecimal("1150.00")),
                TestUtils.toRounded(funci.getSalario()));
    }

    @Test
    public void shouldCalcForGoodPerformance() {
        Funcionario funci = TestUtils.mockFunci("1000");
        service.getReadjustFor(funci, Performance.GOOD);
        assertEquals(
                TestUtils.toRounded(new BigDecimal("1200.00")),
                TestUtils.toRounded(funci.getSalario()));
    }
}
