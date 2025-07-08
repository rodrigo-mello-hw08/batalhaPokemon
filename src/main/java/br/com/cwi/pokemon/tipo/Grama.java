package br.com.cwi.pokemon.tipo;

public class Grama implements Tipo {

    @Override
    public boolean temVantagemSobre(Tipo tipoDefensor) {
        return tipoDefensor instanceof Agua;
    }
}
