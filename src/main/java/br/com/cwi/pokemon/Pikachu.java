package br.com.cwi.pokemon;

import br.com.cwi.ataque.ChoqueDoTrovao;
import br.com.cwi.tipos.Eletrico;

public class Pikachu extends Pokemon {
    private static final int PONTOS_DE_SAUDE = 35;
    private static final int ATAQUE = 55;
    private static final int DEFESA = 40;
    private static final int ATAQUE_ESPECIAL = 50;
    private static final int DEFESA_ESPECIAL = 50;
    private static final int VELOCIDADE = 90;

    public Pikachu() {
        super(status(), new ChoqueDoTrovao(), new Eletrico());
    }

    private static Status status() {
        return new Status(PONTOS_DE_SAUDE, ATAQUE, DEFESA, ATAQUE_ESPECIAL, DEFESA_ESPECIAL, VELOCIDADE);
    }

    @Override
    public String toString() {
        return "Pikachu";
    }
}
