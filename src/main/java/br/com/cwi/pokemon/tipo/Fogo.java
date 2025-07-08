package br.com.cwi.pokemon.tipo;

public class Fogo implements Tipo {

    @Override
    public boolean temVantagemSobre(Tipo tipoDefensor) {
        return tipoDefensor instanceof Grama;
    }
}
