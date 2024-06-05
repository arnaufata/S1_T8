package n1exercici1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<String> cadenes = Arrays.asList("ordinador", "Restaurant", "matalàs", "Orquesta",
                "animal", "Caragol");

        List<String> cadenaFiltrada = MetodeFiltratge.filtrarCadenaContainingO(cadenes);

        cadenaFiltrada.forEach(element -> System.out.println(element));
    }
}
