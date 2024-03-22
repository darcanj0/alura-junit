package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Performance {
    BAD {
        @Override
        public BigDecimal getFactor() {
            return new BigDecimal("1.03");
        }
    },
    MID {
        @Override
        public BigDecimal getFactor() {
            return new BigDecimal("1.15");
        }
    },
    GOOD {
        @Override
        public BigDecimal getFactor() {
            return new BigDecimal("1.20");
        }
    };

    public abstract BigDecimal getFactor();
}
