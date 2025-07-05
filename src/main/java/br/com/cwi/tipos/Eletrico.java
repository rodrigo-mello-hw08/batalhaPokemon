package br.com.cwi.tipos;

public class Eletrico implements Tipo {

    @Override
    public boolean temVantagemSobre(Tipo tipoDefensor) {
        return tipoDefensor instanceof Agua;
    }
}