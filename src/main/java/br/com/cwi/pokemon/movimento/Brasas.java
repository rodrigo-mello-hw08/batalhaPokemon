package br.com.cwi.pokemon.movimento;

import static br.com.cwi.pokemon.movimento.TipoMovimento.ESPECIAL;

public class Brasas extends Movimento {
    private static final String NOME = "Brasas";
    private static final int PODER = 70;
    private static final TipoMovimento TIPO_MOVIMENTO = ESPECIAL;

    public Brasas() {
        super(NOME, PODER, TIPO_MOVIMENTO);
    }
}
