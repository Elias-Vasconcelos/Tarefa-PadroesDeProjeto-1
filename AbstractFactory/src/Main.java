import Carros.Carro;
import Fabricas.FabricaComContrato;
import Fabricas.FabricaSemContrato;
import Fabricas.Factory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Client cliente = new Client("A", true);
        Factory fabrica = consutaFabrica( cliente.hasContract);

         Carro carroDoCliente = fabrica.fabricacao(cliente.tipo);

         System.out.println("o carro Do cliente é um"+ " " + carroDoCliente.getClass().getSimpleName()  );

    }

    private static Factory consutaFabrica(Boolean hasContract) {
        if(hasContract){
            return new FabricaComContrato();
        } else return  new FabricaSemContrato();
    }
}