package br.com.cwi.arena;

import br.com.cwi.item.Item;
import br.com.cwi.pokemon.Pokemon;
import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class Arena {
    private Treinador treinadorA;
    private Treinador treinadorB;
    private int turno = 0;

    public Arena(Treinador treinadorA, Treinador treinadorB) {
        this.treinadorA = treinadorA;
        this.treinadorB = treinadorB;
    }

    public Treinador batalhar() {
        while (semVencedor()) {
            turno++;
            usarItems();
            ataqueTurno();
            treinadorA.removerPokemonsInativos();
            treinadorB.removerPokemonsInativos();
        }
        return treinadorA.possuiPokemonsAtivos() ? treinadorA : treinadorB;
    }

    public void usarItems() {
        usarItem(treinadorA);
        usarItem(treinadorB);
    }

    public void usarItem(Treinador treinador) {
        Item item = treinador.getItem();
        if (item == null || item.getTurnoAcao() != turno) return;
        item.usarItem(treinador.obterPokemonAtivo());
        log.info("O treinador {} usou o item {}", treinador.getNome(), item.getClass().getSimpleName());
    }

    public void ataqueTurno() {
        List<Pokemon> pokemonsTurno = obterPokemonsTurno();
        Pokemon primeiroPokemon = pokemonsTurno.get(0);
        Pokemon segundoPokemon = pokemonsTurno.get(1);

        int dano1 = primeiroPokemon.calcularDano(segundoPokemon);
        log.info("{} ataca com {} de dano", primeiroPokemon.falar(), dano1);
        segundoPokemon.receberAtaque(dano1);
        log.info("{} ficou com {} de vida \n", segundoPokemon.falar(), segundoPokemon.getStatus().getPontosDeSaude());
        if (segundoPokemon.pokemonDerrotado()) return;

        int dano2 = segundoPokemon.calcularDano(primeiroPokemon);
        log.info("{} ataca com {} de dano", segundoPokemon.falar(), dano2);
        primeiroPokemon.receberAtaque(dano2);
        log.info("{} ficou com {} de vida \n", primeiroPokemon.falar(), primeiroPokemon.getStatus().getPontosDeSaude());
    }

    private boolean semVencedor() {
        return treinadorA.possuiPokemonsAtivos() && treinadorB.possuiPokemonsAtivos();
    }

    private List<Pokemon> obterPokemonsTurno() {
        Pokemon pokemonA = treinadorA.obterPokemonAtivo();
        Pokemon pokemonB = treinadorB.obterPokemonAtivo();
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