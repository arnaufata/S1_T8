package n1exercici2;

import java.util.List;
import java.util.stream.Collectors;

public class MetodeFiltratgeDoble {
    public static List<String> filtrarCadenaContaiOMax5 (List<String> cadenes){
        return cadenes.stream()
                .filter(s -> s.toLowerCase().contains("o") && s.length()>5)
                .collect(Collectors.toList());
    }
}
