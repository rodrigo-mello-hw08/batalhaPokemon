package br.com.cwi.movimento;

import static br.com.cwi.movimento.TipoMovimento.ESPECIAL;

public class RaioPsiquico extends Movimento {
    private static final String NOME = "Raio Psiquico";
    private static final int PODER = 100;
    private static final TipoMovimento TIPO_MOVIMENTO = ESPECIAL;

    public RaioPsiquico() {
        super(NOME, PODER, TIPO_MOVIMENTO);
    }
}
