package br.com.cwi.pokemon.movimento;

import br.com.cwi.pokemon.Pokemon;

public enum TipoMovimento {
    FISICO, ESPECIAL;

    public static double coeficienteAtaqueDefesa(Pokemon pokemonAtacante, Pokemon pokemonDefesa) {
        TipoMovimento tipoMovimento = pokemonAtacante.getAtaque().getTipoAtaque();
        switch (tipoMovimento) {
            case FISICO:
                return (double) pokemonAtacante.getStatus().getAtaque() / pokemonDefesa.getStatus().getDefesa();
            case ESPECIAL:
                return (double) pokemonAtacante.getStatus().getAtaqueEspecial() / pokemonDefesa.getStatus().getDefesaEspecial();
            default:
                throw new RuntimeException();
        }
    }
}
