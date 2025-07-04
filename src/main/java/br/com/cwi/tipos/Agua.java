package br.com.cwi.tipos;

public class Agua implements Tipo {

    @Override
    public boolean temVantagemSobre(Tipo tipoDefensor) {
        return tipoDefensor instanceof Fogo;
    }
}
