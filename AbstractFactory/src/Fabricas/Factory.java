package Fabricas;

import Carros.Carro;

public abstract class Factory {

    public Carro fabricacao(String tipo){
        Carro car = encontraCarro(tipo);
        preparaCarro(car);
        return car;
    }


    public Carro preparaCarro(Carro car){
        car.encherCombustivel();
        car.trocaOleo();
        car.limparCarro();
        return car;
    }



    abstract Carro encontraCarro(String tipo);
}
