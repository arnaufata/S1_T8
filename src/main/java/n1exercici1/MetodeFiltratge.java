package n1exercici1;

import java.util.List;
import java.util.stream.Collectors;

public class MetodeFiltratge {
    public static List<String> filtrarCadenaContainingO (List<String> cadenes){
        return cadenes.stream()
                .filter(s -> s.toLowerCase().contains("o"))
                .collect(Collectors.toList());
    }
}
