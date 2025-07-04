package br.com.cwi.pokemon;

import br.com.cwi.ataque.FolhaNavalha;
import br.com.cwi.tipos.Grama;

public class Bulbassauro extends Pokemon {
    private static final int PONTOS_DE_SAUDE = 45;
    private static final int ATAQUE = 49;
    private static final int DEFESA = 49;
    private static final int ATAQUE_ESPECIAL = 65;
    private static final int DEFESA_ESPECIAL = 65;
    private static final int VELOCIDADE = 45;

    public Bulbassauro() {
        super(status(), new FolhaNavalha(), new Grama());
    }

    private static Status status() {
        return new Status(PONTOS_DE_SAUDE, ATAQUE, DEFESA, ATAQUE_ESPECIAL, DEFESA_ESPECIAL, VELOCIDADE);
    }

    @Override
    public String toString() {
        return "Bulbassauro";
    }
}
