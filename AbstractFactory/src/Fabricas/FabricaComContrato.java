package Fabricas;

import Carros.Camaro;
import Carros.Carro;
import Carros.Mustang;

public class FabricaComContrato extends Factory {

    @Override
    Carro encontraCarro(String tipo) {
        if ( tipo.equals("A")){
            Mustang carro = new Mustang(50, "preto", 40);
            return carro;
        } else {
            Camaro carro = new Camaro(40, "amarelo", 30);
            return carro;
        }
    }
}
