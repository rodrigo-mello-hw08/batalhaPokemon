package br.com.cwi.arena;

import br.com.cwi.item.Pocao;
import br.com.cwi.item.SuperPocao;
import br.com.cwi.pokemon.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArenaTest {

    @Test
    public void deveEncerrarBatalhaComTreinadorBComoVencedor() {
        Treinador red = new Treinador("Red", new Pocao());
        red.adicionarAoTime(new Charmander());

        Treinador blue = new Treinador("Blue", new SuperPocao());
        blue.adicionarAoTime(new Squirtle());

        Arena arena = new Arena(red, blue);
        Treinador vencedor = arena.batalhar();
        assertNotNull(vencedor);
    }

    @Test
    public void teste() {
        Treinador red = new Treinador("Red", new Pocao());
        red.adicionarAoTime(new Charmander());
        red.adicionarAoTime(new Pikachu());
        red.adicionarAoTime(new Bulbassauro());

        Treinador blue = new Treinador("Blue", new SuperPocao());
        blue.adicionarAoTime(new Squirtle());
        blue.adicionarAoTime(new Bulbassauro());

        Arena arena = new Arena(red, blue);
        Treinador vencedor = arena.batalhar();
        assertNotNull(vencedor);
    }

    @Test
    public void redDeveDerrotarTodosOsPokemonsUsandoMewtwo() {
        Treinador red = new Treinador("Red", new Pocao());
        red.adicionarAoTime(new Mewtwo());

        Treinador blue = new Treinador("Blue", new SuperPocao());
        blue.adicionarAoTime(new Squirtle());
        blue.adicionarAoTime(new Bulbassauro());
        blue.adicionarAoTime(new Pikachu());
        blue.adicionarAoTime(new Charmander());

        Arena arena = new Arena(red, blue);
        Treinador vencedor = arena.batalhar();
        assertEquals(red, vencedor);
    }

}