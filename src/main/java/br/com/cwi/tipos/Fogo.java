package br.com.cwi.tipos;

public class Fogo implements Tipo {

    @Override
    public boolean temVantagemSobre(Tipo tipoDefensor) {
        return tipoDefensor instanceof Grama;
    }
}
