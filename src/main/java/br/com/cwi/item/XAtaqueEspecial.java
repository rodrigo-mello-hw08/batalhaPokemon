package br.com.cwi.item;

import br.com.cwi.pokemon.Pokemon;
import br.com.cwi.pokemon.Atributo;

public class XAtaqueEspecial extends Item {
    private static int TURNO_ACAO = 1;
    private static int ATAQUE_ESPECIAL_BONUS = 400;

    public XAtaqueEspecial() {
        super(TURNO_ACAO);
    }

    @Override
    public void usarItem(Pokemon pokemon) {
        Atributo atributoPokemon = pokemon.getStatus();
        int novoAtaqueEspecial = atributoPokemon.getAtaqueEspecial() + ATAQUE_ESPECIAL_BONUS;
        atributoPokemon.setAtaqueEspecial(novoAtaqueEspecial);
    }
}
