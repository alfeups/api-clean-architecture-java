package br.com.mibands;

public class BandaNaoInformadaException extends RuntimeException{

    public BandaNaoInformadaException(){
        super("banda não informada");
    }
}
