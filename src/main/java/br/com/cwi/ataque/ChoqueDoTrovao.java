package br.com.cwi.ataque;

import static br.com.cwi.ataque.TipoAtaque.ESPECIAL;

public class ChoqueDoTrovao extends Ataque {
    private static final int PODER = 60;
    private static final TipoAtaque TIPO_ATAQUE = ESPECIAL;

    public ChoqueDoTrovao() {
        super(PODER, TIPO_ATAQUE);
    }
}