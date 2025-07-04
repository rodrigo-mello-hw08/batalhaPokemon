package br.com.cwi.ataque;

import br.com.cwi.pokemon.Pokemon;

public enum TipoAtaque {
    FISICO, ESPECIAL;

    public static double coeficienteAtaqueDefesa(Pokemon pokemonAtacante, Pokemon pokemonDefesa) {
        TipoAtaque tipoAtaque = pokemonAtacante.getAtaque().getTipoAtaque();
        switch (tipoAtaque) {
            case FISICO:
                return (double) pokemonAtacante.getStatus().getAtaque() / pokemonDefesa.getStatus().getDefesa();
            case ESPECIAL:
                return (double) pokemonAtacante.getStatus().getAtaqueEspecial() / pokemonDefesa.getStatus().getDefesaEspecial();
            default:
                throw new RuntimeException();
        }
    }
}
