package br.com.cwi.item;

import br.com.cwi.pokemon.Pokemon;

public class Pocao implements Item {

    private static int TURNO_ACAO = 8;

    @Override
    public int getTurnoAcao() {
        return TURNO_ACAO;
    }

    @Override
    public void usarItem(Pokemon pokemon) {

    }
}
