package br.com.cwi.pokemon.movimento;

public abstract class Movimento {
    private String nome;
    private int poder;
    private TipoMovimento tipoMovimento;

    public Movimento(String nome, int poder, TipoMovimento tipoMovimento) {
        this.nome = nome;
        this.poder = poder;
        this.tipoMovimento = tipoMovimento;
    }

    public String getNome() {
        return nome;
    }

    public int getPoder() {
        return poder;
    }

    public TipoMovimento getTipoAtaque() {
        return tipoMovimento;
    }
}
