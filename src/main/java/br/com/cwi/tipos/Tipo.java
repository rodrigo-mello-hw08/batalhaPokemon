package br.com.cwi.tipos;

public interface Tipo {
    int MULTIPLICADOR_SUPER_EFETIVO = 2;
    int MULTIPLICADOR = 1;

    boolean temVantagemSobre(Tipo outroTipo);
}
