package br.com.cwi.pokemon;

import br.com.cwi.pokemon.movimento.Brasas;
import br.com.cwi.pokemon.tipo.Fogo;

public class Charmander extends Pokemon {
    private static final int PONTOS_DE_SAUDE = 39;
    private static final int ATAQUE = 52;
    private static final int DEFESA = 43;
    private static final int ATAQUE_ESPECIAL = 60;
    private static final int DEFESA_ESPECIAL = 50;
    private static final int VELOCIDADE = 65;

    public Charmander() {
        super(status(), new Brasas(), new Fogo());
    }

    private static Atributos status() {
        return new Atributos(PONTOS_DE_SAUDE, ATAQUE, DEFESA, ATAQUE_ESPECIAL, DEFESA_ESPECIAL, VELOCIDADE);
    }

    @Override
    public String falar() {
        return "Charmander";
    }
}