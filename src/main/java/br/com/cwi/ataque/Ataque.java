package br.com.cwi.ataque;

public abstract class Ataque {
    private int poder;
    private TipoAtaque tipoAtaque;

    public Ataque(int poder, TipoAtaque tipoAtaque) {
        this.poder = poder;
        this.tipoAtaque = tipoAtaque;
    }

    public int getPoder() {
        return poder;
    }

    public TipoAtaque getTipoAtaque() {
        return tipoAtaque;
    }
}
