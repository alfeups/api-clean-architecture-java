package br.com.mibands;

public class BandaService implements BandaServicePort{

    private final BandaRepositoryPort repository;

    public BandaService(final BandaRepositoryPort repository){
        this.repository = repository;
    }


    @Override
    public void cadastrar(BandaDto dto) {
        if(dto == null){
            throw new BandaNaoInformadaException();
        }
        var banda = new Banda(dto.getNome(), dto.getGenero());
        repository.salvar(banda);
    }

    @Override
    public Banda procurarPorNome(String nome) {
        return repository.procurarPorNome(nome);
    }
}
