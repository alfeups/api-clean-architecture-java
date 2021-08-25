package br.com.mibands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestBandaService {

    @Test
    void deveCadastrarBandaComSucesso() {
        var nome = "rammstein";
        var genero = "Rock";
        var dto = new BandaDto(nome, genero);
        var repository = new InMemoryDb();
        var service = new BandaService(repository);
        assertDoesNotThrow(() -> service.cadastrar(dto));
    }

    @Test
    void deveCadastrarBandaMasDeveLancarBandaNaoInformadaException() {
        var repository = new InMemoryDb();
        var service = new BandaService(repository);
        assertThrows(BandaNaoInformadaException.class, () -> service.cadastrar(null));
    }
}
