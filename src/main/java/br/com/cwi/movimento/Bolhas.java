package br.com.cwi.movimento;

import static br.com.cwi.movimento.TipoMovimento.ESPECIAL;

public class Bolhas extends Movimento {
    private static final String NOME = "Bolhas";
    private static final int PODER = 75;
    private static final TipoMovimento TIPO_MOVIMENTO = ESPECIAL;

    public Bolhas() {
        super(NOME, PODER, TIPO_MOVIMENTO);
    }
}
