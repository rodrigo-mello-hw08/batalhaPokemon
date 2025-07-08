package br.com.cwi.pokemon.tipo;

public interface Tipo {
    int MULTIPLICADOR_SUPER_EFETIVO = 2;
    int MULTIPLICADOR = 1;

    boolean temVantagemSobre(Tipo outroTipo);
}
