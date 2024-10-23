package Carros;

public abstract class Carro {
    private String cor;
    private Integer combustivel, oleo;

    public Carro(Integer combustivel, String cor, Integer oleo) {
        this.combustivel = combustivel;
        this.cor = cor;
        this.oleo = oleo;
    }

    public void limparCarro(){
        System.out.println("O carro foi limpo!");
    }

    public void encherCombustivel(){
        System.out.println("O carro foi abastecido!");
        this.combustivel = 100;
    }

    public void trocaOleo(){
        System.out.println("O oleo do carro foi trocado!");
        this.oleo = 100;
    }

}
