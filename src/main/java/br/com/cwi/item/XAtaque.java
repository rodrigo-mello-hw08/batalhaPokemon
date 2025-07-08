package br.com.cwi.item;

import br.com.cwi.pokemon.Atributos;
import br.com.cwi.pokemon.Pokemon;

public class XAtaque extends Item {
    private static int TURNO_ACAO = 3;
    private static int ATAQUE_BONUS = 200;

    public XAtaque() {
        super(TURNO_ACAO);
    }

    @Override
    public void usarItem(Pokemon pokemon) {
        Atributos atributosPokemon = pokemon.getStatus();
        int novoAtaque = atributosPokemon.getAtaque() + ATAQUE_BONUS;
        atributosPokemon.setAtaque(novoAtaque);
    }
}
