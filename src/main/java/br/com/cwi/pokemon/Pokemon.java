package br.com.cwi.pokemon;

import br.com.cwi.movimento.Movimento;
import br.com.cwi.movimento.TipoMovimento;
import br.com.cwi.tipos.Tipo;

public abstract class Pokemon {
    private static final double MODIFICADOR_BASE_DANO = 0.5;
    private Atributo atributo;
    private boolean derrotado;
    private Movimento movimento;
    private Tipo tipo;

    public Pokemon(Atributo atributo, Movimento movimento, Tipo tipo) {
        this.atributo = atributo;
        this.derrotado = false;
        this.movimento = movimento;
        this.tipo = tipo;
    }

    public abstract String falar();

    public int calcularDano(Pokemon adversario) {
        int danoAtaque = this.movimento.getPoder();
        double coeficiente = TipoMovimento.coeficienteAtaqueDefesa(this, adversario);
        boolean pokemonTemVantagem = this.tipo.temVantagemSobre(adversario.getTipo());
        int multiplicadorVantagem = pokemonTemVantagem ? Tipo.MULTIPLICADOR_SUPER_EFETIVO : Tipo.MULTIPLICADOR;

        double dano = MODIFICADOR_BASE_DANO * danoAtaque * coeficiente * multiplicadorVantagem;
        return (int) Math.ceil(dano);
    }

    public void receberAtaque(int dano) {
        this.atributo.setPontosDeSaude(this.atributo.getPontosDeSaude() - dano);
        this.derrotado = this.atributo.getPontosDeSaude() <=0;
    }

    public boolean pokemonDerrotado() {
        return this.derrotado;
    }

    public Atributo getStatus() {
        return atributo;
    }

    public Movimento getAtaque() {
        return movimento;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getVelocidadePokemon() {
        return this.atributo.getVelocidade();
    }
}