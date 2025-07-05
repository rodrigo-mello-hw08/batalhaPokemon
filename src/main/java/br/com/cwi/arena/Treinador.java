package br.com.cwi.arena;

import br.com.cwi.item.Item;
import br.com.cwi.pokemon.Pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Treinador {
    private String nome;
    private List<Pokemon> pokemons = new ArrayList<>();
    private Item item;

    public Treinador(String nome, Item item) {
        this.nome = nome;
        this.item = item;
    }

    public void adicionarAoTime(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }
    public boolean todosPokemonsDerrotados() {
        return pokemons.stream().allMatch(Pokemon::pokemonDerrotado);
    }

    public boolean possuiPokemonsAtivos() {
        return !todosPokemonsDerrotados();
    }

    public void removerPokemonsInativos() {
        pokemons.removeIf(Pokemon::pokemonDerrotado);
    }

    public Pokemon obterPrimeiroPokemon() {
        return pokemons.get(0);
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Treinador treinador = (Treinador) o;
        return Objects.equals(getNome(), treinador.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }
}