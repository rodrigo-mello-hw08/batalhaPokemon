package br.com.cwi.pokemon;

import br.com.cwi.pokemon.movimento.AtaqueRapido;
import br.com.cwi.pokemon.tipo.Eletrico;

public class Pikachu extends Pokemon {
    private static final int PONTOS_DE_SAUDE = 35;
    private static final int ATAQUE = 55;
    private static final int DEFESA = 40;
    private static final int ATAQUE_ESPECIAL = 50;
    private static final int DEFESA_ESPECIAL = 50;
    private static final int VELOCIDADE = 90;

    public Pikachu() {
        super(status(), new AtaqueRapido(), new Eletrico());
    }

    private static Atributos status() {
        return new Atributos(PONTOS_DE_SAUDE, ATAQUE, DEFESA, ATAQUE_ESPECIAL, DEFESA_ESPECIAL, VELOCIDADE);
    }

    @Override
    public String falar() {
        return "Pikachu";
    }
}
