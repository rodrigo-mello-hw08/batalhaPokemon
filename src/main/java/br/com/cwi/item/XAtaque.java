package br.com.cwi.item;

import br.com.cwi.pokemon.Pokemon;
import br.com.cwi.pokemon.Atributo;

public class XAtaque extends Item {
    private static int TURNO_ACAO = 3;
    private static int ATAQUE_BONUS = 200;

    public XAtaque() {
        super(TURNO_ACAO);
    }

    @Override
    public void usarItem(Pokemon pokemon) {
        Atributo atributoPokemon = pokemon.getStatus();
        int novoAtaque = atributoPokemon.getAtaque() + ATAQUE_BONUS;
        atributoPokemon.setAtaque(novoAtaque);
    }
}
