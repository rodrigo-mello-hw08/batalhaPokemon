package br.com.cwi.arena;

import br.com.cwi.pokemon.Pokemon;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Arena {
    private Treinador treinadorA;
    private Treinador treinadorB;

    public Arena(Treinador treinadorA, Treinador treinadorB) {
        this.treinadorA = treinadorA;
        this.treinadorB = treinadorB;
    }

    public Treinador batalhar() {
        while (semVencedor()) {
            ataqueTurno();
            treinadorA.removerPokemonsInativos();
            treinadorB.removerPokemonsInativos();
        }
        return treinadorA.possuiPokemonsAtivos() ? treinadorA : treinadorB;
    }

    public void ataqueTurno() {
        List<Pokemon> pokemonsTurno = obterPokemonsTurno();
        Pokemon primeiroPokemon = pokemonsTurno.get(0);
        Pokemon segundoPokemon = pokemonsTurno.get(1);

        int dano1 = primeiroPokemon.calcularDano(segundoPokemon);
        System.out.println(String.format("%s ataca com %d de dano", primeiroPokemon, dano1));
        segundoPokemon.receberAtaque(dano1);
        System.out.println(String.format("%s ficou com %d de vida \n", segundoPokemon, segundoPokemon.getStatus().getPontosDeSaude()));
        if (segundoPokemon.pokemonDerrotado()) return;

        int dano2 = segundoPokemon.calcularDano(primeiroPokemon);
        System.out.println(String.format("%s ataca com %d de dano", segundoPokemon, dano2));
        primeiroPokemon.receberAtaque(dano2);
        System.out.println(String.format("%s ficou com %d de vida \n", primeiroPokemon, primeiroPokemon.getStatus().getPontosDeSaude()));
    }

    private boolean semVencedor() {
        return treinadorA.possuiPokemonsAtivos() && treinadorB.possuiPokemonsAtivos();
    }

    private List<Pokemon> obterPokemonsTurno() {
        Pokemon pokemonA = treinadorA.obterPrimeiroPokemon();
        Pokemon pokemonB = treinadorB.obterPrimeiroPokemon();
        List<Pokemon> pokemons = List.of(pokemonA, pokemonB);
        boolean velocidadesDiferentes = pokemonA.getVelocidadePokemon() != pokemonB.getVelocidadePokemon();
        if (velocidadesDiferentes) {
            pokemons = ordernarPelaVelocidade(pokemons);
        }
        return pokemons;
    }

    private static List<Pokemon> ordernarPelaVelocidade(List<Pokemon> pokemons) {
        return pokemons.stream()
            .sorted(Comparator.comparing(Pokemon::getVelocidadePokemon).reversed())
            .collect(Collectors.toList());
    }

}