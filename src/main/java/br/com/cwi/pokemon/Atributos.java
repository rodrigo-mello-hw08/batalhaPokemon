package br.com.cwi.pokemon;

public class Atributos {
    private int pontosDeSaude;
    private int ataque;
    private int defesa;
    private int ataqueEspecial;
    private int defesaEspecial;
    private int velocidade;

    public Atributos(int pontosDeSaude, int ataque, int defesa, int ataqueEspecial, int defesaEspecial, int velocidade) {
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

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
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
