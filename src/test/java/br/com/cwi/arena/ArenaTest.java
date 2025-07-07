package br.com.cwi.arena;

import br.com.cwi.item.XAtaqueEspecial;
import br.com.cwi.item.Pocao;
import br.com.cwi.pokemon.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArenaTest {

    @Test
    public void deveEncerrarBatalhaComVitoriaDeBlue() {
        Treinador red = new Treinador("Red");
        red.adicionarAoTime(new Charmander());

        Treinador blue = new Treinador("Blue");
        blue.adicionarAoTime(new Squirtle());

        Arena arena = new Arena(red, blue);
        Treinador vencedor = arena.batalhar();
        assertEquals(blue, vencedor);
    }

    @Test
    public void deveEncerrarBatalhaComVitoriaDeBlueMesmoAposInverterAOrdem() {
        Treinador blue = new Treinador("Blue");
        blue.adicionarAoTime(new Squirtle());

        Treinador red = new Treinador("Red");
        red.adicionarAoTime(new Charmander());

        Arena arena = new Arena(blue, red);
        Treinador vencedor = arena.batalhar();
        assertEquals(blue, vencedor);
    }

    @Test
    public void deveEncerrarBatalhaComVitoriaDeBlueDevidoAPocao() {
        Treinador red = new Treinador("Red");
        red.adicionarAoTime(new Squirtle());
        red.adicionarAoTime(new Charmander());

        Treinador blue = new Treinador("Blue", new Pocao());
        blue.adicionarAoTime(new Squirtle());
        blue.adicionarAoTime(new Bulbasaur());

        Arena arena = new Arena(red, blue);
        Treinador vencedor = arena.batalhar();
        assertEquals(blue, vencedor);
    }

    @Test
    public void deveEncerrarComVitoriaDeRedDevidoAItemApelao() {
        Treinador red = new Treinador("Red", new XAtaqueEspecial());
        red.adicionarAoTime(new Charmander());

        Treinador blue = new Treinador("Blue");
        blue.adicionarAoTime(new Squirtle());
        blue.adicionarAoTime(new Bulbasaur());
        blue.adicionarAoTime(new Charmander());

        Arena arena = new Arena(red, blue);
        Treinador vencedor = arena.batalhar();
        assertEquals(red, vencedor);
    }

    @Test
    public void deveEncerrarComVitoriaDeBlueDevidoAVelocidadeDePikachu() {
        Treinador red = new Treinador("Red", new XAtaqueEspecial());
        red.adicionarAoTime(new Charmander());

        Treinador blue = new Treinador("Blue");
        blue.adicionarAoTime(new Squirtle());
        blue.adicionarAoTime(new Pikachu());

        Arena arena = new Arena(red, blue);
        Treinador vencedor = arena.batalhar();
        assertEquals(blue, vencedor);
    }

    //Todo: escrever cenario com ataque rapido?? se sim colocar no readme
    //Todo: escrever cenario onde o AtaqueEspecialX é definitivo no vencedor
    //Todo: escrever cenario onde o AtaqueX é definitivo no vencedor
    //Todo: escrever cenario onde a Pocao é definitivo no vencedor


}