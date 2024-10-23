package Fabricas;

import Carros.*;

public class FabricaSemContrato extends  Factory{
    @Override
    Carro encontraCarro(String tipo) {
        if ( tipo.equals("A")){
            Corolla carro = new Corolla(50, "preto", 40);
            return carro;
        } else {
            Civic carro = new Civic(40, "amarelo", 30);
            return carro;
        }
    }
}
