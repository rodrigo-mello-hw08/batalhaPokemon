package br.com.cwi.item;

import br.com.cwi.pokemon.Atributos;
import br.com.cwi.pokemon.Pokemon;

public class XAtaqueEspecial extends Item {
    private static int TURNO_ACAO = 1;
    private static int ATAQUE_ESPECIAL_BONUS = 400;

    public XAtaqueEspecial() {
        super(TURNO_ACAO);
    }

    @Override
    public void usarItem(Pokemon pokemon) {
        Atributos atributosPokemon = pokemon.getStatus();
        int novoAtaqueEspecial = atributosPokemon.getAtaqueEspecial() + ATAQUE_ESPECIAL_BONUS;
        atributosPokemon.setAtaqueEspecial(novoAtaqueEspecial);
    }
}
