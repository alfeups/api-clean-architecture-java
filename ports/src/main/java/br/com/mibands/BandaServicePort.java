package br.com.mibands;

public interface BandaServicePort {

    void cadastrar(BandaDto dto);
    Banda procurarPorNome(String nome);
}
