package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.Performance;

public class ReadjustService {
    public void getReadjustFor(Funcionario funci, Performance performance) {
        switch (performance) {
            case BAD:
                funci.setSalario(
                        funci.getSalario()
                                .multiply(new BigDecimal("1.03")));
                break;
            case MID:
                funci.setSalario(funci.getSalario().multiply(new BigDecimal("1.15")));
                break;
            case GOOD:
                funci.setSalario(funci.getSalario().multiply(new BigDecimal("1.20")));
                break;
            default:
                break;
        }
    }
}
