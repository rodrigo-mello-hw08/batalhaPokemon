package br.com.cwi.ataque;

import static br.com.cwi.ataque.TipoAtaque.ESPECIAL;

public class RaioPsiquico extends Ataque {
    private static final int PODER = 100;
    private static final TipoAtaque TIPO_ATAQUE = ESPECIAL;

    public RaioPsiquico() {
        super(PODER, TIPO_ATAQUE);
    }
}
