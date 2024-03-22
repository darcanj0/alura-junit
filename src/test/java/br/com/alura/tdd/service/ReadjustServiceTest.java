package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.Performance;
import br.com.alura.tdd.test_util.TestUtils;

public class ReadjustServiceTest {
    @Test
    public void shouldCalcForBadPerformance() {
        ReadjustService service = new ReadjustService();
        Funcionario funci = new Funcionario("dani", LocalDate.now(), new BigDecimal("1000"));
        service.getReadjustFor(funci, Performance.BAD);
        assertEquals(
                TestUtils.toRounded(new BigDecimal("1030.00")),
                TestUtils.toRounded(funci.getSalario()));

    }

    @Test
    public void shouldCalcForMidPerformance() {
        ReadjustService service = new ReadjustService();
        Funcionario funci = new Funcionario("dani", LocalDate.now(), new BigDecimal("1000"));
        service.getReadjustFor(funci, Performance.MID);
        assertEquals(
                TestUtils.toRounded(new BigDecimal("1150.00")),
                TestUtils.toRounded(funci.getSalario()));
    }

    @Test
    public void shouldCalcForGoodPerformance() {
        ReadjustService service = new ReadjustService();
        Funcionario funci = new Funcionario("dani", LocalDate.now(), new BigDecimal("1000"));
        service.getReadjustFor(funci, Performance.GOOD);
        assertEquals(
                TestUtils.toRounded(new BigDecimal("1200.00")),
                TestUtils.toRounded(funci.getSalario()));
    }
}
