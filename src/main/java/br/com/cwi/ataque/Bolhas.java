package br.com.cwi.ataque;

import static br.com.cwi.ataque.TipoAtaque.ESPECIAL;

public class Bolhas extends Ataque {
    private static final int PODER = 75;
    private static final TipoAtaque TIPO_ATAQUE = ESPECIAL;

    public Bolhas() {
        super(PODER, TIPO_ATAQUE);
    }
}
