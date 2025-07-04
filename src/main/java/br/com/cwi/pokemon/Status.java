package br.com.cwi.pokemon;

public class Status {
    private int pontosDeSaude;
    private int ataque;
    private int defesa;
    private int ataqueEspecial;
    private int defesaEspecial;
    private int velocidade;

    public Status(int pontosDeSaude, int ataque, int defesa, int ataqueEspecial, int defesaEspecial, int velocidade) {
        this.pontosDeSaude = pontosDeSaude;
        this.ataque = ataque;
        this.defesa = defesa;
        this.ataqueEspecial = ataqueEspecial;
        this.defesaEspecial = defesaEspecial;
        this.velocidade = velocidade;
    }

    public void setPontosDeSaude(int pontosDeSaude) {
        this.pontosDeSaude = pontosDeSaude;
    }

    public int getPontosDeSaude() {
        return pontosDeSaude;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getDefesaEspecial() {
        return defesaEspecial;
    }

    public int getVelocidade() {
        return velocidade;
    }
}
