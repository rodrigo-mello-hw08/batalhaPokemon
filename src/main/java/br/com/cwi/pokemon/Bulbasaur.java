package br.com.cwi.pokemon;

import br.com.cwi.pokemon.movimento.FolhaNavalha;
import br.com.cwi.pokemon.tipo.Grama;

public class Bulbasaur extends Pokemon {
    private static final int PONTOS_DE_SAUDE = 45;
    private static final int ATAQUE = 49;
    private static final int DEFESA = 49;
    private static final int ATAQUE_ESPECIAL = 65;
    private static final int DEFESA_ESPECIAL = 65;
    private static final int VELOCIDADE = 45;

    public Bulbasaur() {
        super(status(), new FolhaNavalha(), new Grama());
    }

    private static Atributos status() {
        return new Atributos(PONTOS_DE_SAUDE, ATAQUE, DEFESA, ATAQUE_ESPECIAL, DEFESA_ESPECIAL, VELOCIDADE);
    }

    @Override
    public String falar() {
        return "Bulbassauro";
    }
}
