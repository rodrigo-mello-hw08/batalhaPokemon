package br.com.cwi.pokemon.movimento;

import static br.com.cwi.pokemon.movimento.TipoMovimento.FISICO;

public class FolhaNavalha extends Movimento {
    private static final String NOME = "Folha Navalha";
    private static final int PODER = 60;
    private static final TipoMovimento TIPO_MOVIMENTO = FISICO;

    public FolhaNavalha() {
        super(NOME, PODER, TIPO_MOVIMENTO);
    }
}
