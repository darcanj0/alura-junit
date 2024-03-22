package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.Performance;

public class ReadjustService {
    public void getReadjustFor(Funcionario funci, Performance performance) {
        funci.setSalario(funci.getSalario().multiply(performance.getFactor()));
    }
}
