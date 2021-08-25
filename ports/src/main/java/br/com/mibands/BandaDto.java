package br.com.mibands;

public class BandaDto {

    private String nome;
    private String genero;

    public BandaDto(){}

    public BandaDto(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
