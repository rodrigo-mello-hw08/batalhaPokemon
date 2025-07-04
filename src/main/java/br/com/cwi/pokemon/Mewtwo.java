package br.com.cwi.pokemon;

import br.com.cwi.ataque.RaioPsiquico;
import br.com.cwi.tipos.Psiquico;

public class Mewtwo extends Pokemon {
    private static final int PONTOS_DE_SAUDE = 322;
    private static final int ATAQUE = 202;
    private static final int DEFESA = 166;
    private static final int ATAQUE_ESPECIAL = 281;
    private static final int DEFESA_ESPECIAL = 166;
    private static final int VELOCIDADE = 238;

    public Mewtwo() {
        super(status(), new RaioPsiquico(), new Psiquico());
    }

    private static Status status() {
        return new Status(PONTOS_DE_SAUDE, ATAQUE, DEFESA, ATAQUE_ESPECIAL, DEFESA_ESPECIAL, VELOCIDADE);
    }

    @Override
    public String toString() {
        return "Mewtwo";
    }
}
