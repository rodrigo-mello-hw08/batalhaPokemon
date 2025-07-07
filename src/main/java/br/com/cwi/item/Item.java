package br.com.cwi.item;

import br.com.cwi.pokemon.Pokemon;

public abstract class Item {
    protected int turnoAcao;

    public Item(int turnoAcao) {
        this.turnoAcao = turnoAcao;
    }

    public int getTurnoAcao() {
        return turnoAcao;
    }

    public abstract void usarItem(Pokemon pokemon);
}