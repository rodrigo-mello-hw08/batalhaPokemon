package br.com.cwi.pokemon;

import br.com.cwi.ataque.Ataque;
import br.com.cwi.ataque.TipoAtaque;
import br.com.cwi.tipos.Tipo;

public abstract class Pokemon {
    private static final double MODIFICADOR_BASE_DANO = 0.5;
    private Status status;
    private boolean derrotado;
    private Ataque ataque;
    private Tipo tipo;

    public Pokemon(Status status, Ataque ataque, Tipo tipo) {
        this.status = status;
        this.derrotado = false;
        this.ataque = ataque;
        this.tipo = tipo;
    }

    public int calcularDano(Pokemon adversario) {
        int danoAtaque = this.ataque.getPoder();
        double coeficiente = TipoAtaque.coeficienteAtaqueDefesa(this, adversario);
        boolean pokemonTemVantagem = this.tipo.temVantagemSobre(adversario.getTipo());
        int multiplicadorVantagem = pokemonTemVantagem ? Tipo.MULTIPLICADOR_SUPER_EFETIVO : Tipo.MULTIPLICADOR;

        double dano = MODIFICADOR_BASE_DANO * danoAtaque * coeficiente * multiplicadorVantagem;
        return (int) Math.ceil(dano);
    }

    public void receberAtaque(int dano) {
        this.status.setPontosDeSaude(this.status.getPontosDeSaude() - dano);
        this.derrotado = this.status.getPontosDeSaude() <=0;
    }

    public boolean pokemonDerrotado() {
        return this.derrotado;
    }

    public Status getStatus() {
        return status;
    }

    public Ataque getAtaque() {
        return ataque;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getVelocidadePokemon() {
        return this.status.getVelocidade();
    }
}