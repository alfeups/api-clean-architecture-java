package br.com.mibands;

public abstract class BandaRepositoryPort {

    abstract void salvar(Banda banda);
    abstract Banda procurarPorNome(String nome);
}
