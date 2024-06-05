package n1exercici2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<String> cadenes = Arrays.asList("ordinador", "Restaurant", "matalàs", "Orquesta",
                "animal", "Caragol", "oriol", "Okey");

        List<String> cadenaFiltrada = MetodeFiltratgeDoble.filtrarCadenaContaiOMax5(cadenes);

        cadenaFiltrada.forEach(element -> System.out.println(element));
    }
}
