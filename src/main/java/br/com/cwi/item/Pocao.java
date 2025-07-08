package br.com.cwi.item;

import br.com.cwi.pokemon.Atributos;
import br.com.cwi.pokemon.Pokemon;

public class Pocao extends Item {
    private static int TURNO_ACAO = 3;
    private static int PONTOS_DE_CURA = 100;

    public Pocao() {
        super(TURNO_ACAO);
    }

    @Override
    public void usarItem(Pokemon pokemon) {
        Atributos atributosPokemon = pokemon.getStatus();
        int novaSaude = atributosPokemon.getPontosDeSaude() + PONTOS_DE_CURA;
        atributosPokemon.setPontosDeSaude(novaSaude);
    }
}
