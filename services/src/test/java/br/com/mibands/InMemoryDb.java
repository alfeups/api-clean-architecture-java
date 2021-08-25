package br.com.mibands;

import java.util.Hashtable;

public class InMemoryDb extends BandaRepositoryPort {


    private final Hashtable<String, Banda> repository;

    public InMemoryDb() {
        this.repository = new Hashtable<>();
    }

    @Override
    public void salvar(Banda banda) {
    repository.put(banda.getNome(), banda);
    }

    @Override
    public Banda procurarPorNome(String nome){
    return repository.get(nome);
    }
}
