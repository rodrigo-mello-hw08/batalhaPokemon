package br.com.cwi.item;

import br.com.cwi.pokemon.Pokemon;

public interface Item {
    int getTurnoAcao();
    void usarItem(Pokemon pokemon);
}
