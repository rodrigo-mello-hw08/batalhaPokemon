package br.com.cwi.ataque;

import static br.com.cwi.ataque.TipoAtaque.ESPECIAL;

public class Brasas extends Ataque {
    private static final int PODER = 70;
    private static final TipoAtaque TIPO_ATAQUE = ESPECIAL;

    public Brasas() {
        super(PODER, TIPO_ATAQUE);
    }
}
