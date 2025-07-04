package br.com.cwi.tipos;

public class Psiquico implements Tipo {

    @Override
    public boolean temVantagemSobre(Tipo tipoDefensor) {
        return false;
    }
}
