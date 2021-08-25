package br.com.mibands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteBanda {


    @Test
    void deveInstanciarBandaComSucesso() {
        var nome = "Rammstein";
        var genero = "Rock";
        assertAll ("todos os testes",
                () -> assertDoesNotThrow(() -> new Banda(nome, genero)),
                () -> assertEquals(nome, new Banda(nome, genero).getNome()),
                () -> assertEquals(genero, new Banda(nome, genero).getGenero())
        );
    }
}
