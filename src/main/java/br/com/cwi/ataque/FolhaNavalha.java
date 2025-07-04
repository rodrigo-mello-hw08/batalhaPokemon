package br.com.cwi.ataque;

import static br.com.cwi.ataque.TipoAtaque.FISICO;

public class FolhaNavalha extends Ataque {
    private static final int PODER = 60;
    private static final TipoAtaque TIPO_ATAQUE = FISICO;

    public FolhaNavalha() {
        super(PODER, TIPO_ATAQUE);
    }
}
