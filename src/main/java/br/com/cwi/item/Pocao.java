package br.com.cwi.item;

import br.com.cwi.pokemon.Atributos;
import br.com.cwi.pokemon.Pokemon;

public class Pocao extends Item {
    private static int TURNO_ACAO = 2;
    private static int PONTOS_DE_CURA = 50;

    public Pocao() {
        super(TURNO_ACAO);
    }

    @Override
    public void usarItem(Pokemon pokemon) {
        Atributos atributosPokemon = pokemon.getStatus();
        int novaSaude = atributosPokemon.getPontosDeSaude() + PONTOS_DE_CURA;
        if (novaSaude >= atributosPokemon.getPontosDeSaudeMax()) {
            atributosPokemon.setPontosDeSaude(atributosPokemon.getPontosDeSaudeMax());
        } else {
            atributosPokemon.setPontosDeSaude(novaSaude);
        }
    }
}
