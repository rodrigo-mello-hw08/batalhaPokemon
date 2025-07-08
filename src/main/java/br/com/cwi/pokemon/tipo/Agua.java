package br.com.cwi.pokemon.tipo;

public class Agua implements Tipo {

    @Override
    public boolean temVantagemSobre(Tipo tipoDefensor) {
        return tipoDefensor instanceof Fogo;
    }
}
