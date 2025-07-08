package br.com.cwi.pokemon;

import br.com.cwi.pokemon.movimento.Bolhas;
import br.com.cwi.pokemon.tipo.Agua;

public class Squirtle extends Pokemon {
    private static final int PONTOS_DE_SAUDE = 44;
    private static final int ATAQUE = 48;
    private static final int DEFESA = 65;
    private static final int ATAQUE_ESPECIAL = 50;
    private static final int DEFESA_ESPECIAL = 64;
    private static final int VELOCIDADE = 43;

    public Squirtle() {
        super(status(), new Bolhas(), new Agua());
    }

    private static Atributos status() {
        return new Atributos(PONTOS_DE_SAUDE, ATAQUE, DEFESA, ATAQUE_ESPECIAL, DEFESA_ESPECIAL, VELOCIDADE);
    }

    @Override
    public String falar() {
        return "Squirtle";
    }
}
