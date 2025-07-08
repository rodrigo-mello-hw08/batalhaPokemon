package br.com.cwi.pokemon.movimento;

import static br.com.cwi.pokemon.movimento.TipoMovimento.FISICO;

public class AtaqueRapido extends Movimento {
    private static final String NOME = "Ataque Rapido";
    private static final int PODER = 60;
    private static final TipoMovimento TIPO_MOVIMENTO = FISICO;

    public AtaqueRapido() {
        super(NOME, PODER, TIPO_MOVIMENTO);
    }
}