package n1exercici6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){

        List<Object> llistaMixta = Arrays.asList("Arnau", 7, "Guillem", 10, "Clara", 3, "Bernat", 6,
                "Misericòrdia", 8, "Nil", 2);

        List<String> strings = llistaMixta.stream()
                .filter(obj -> obj instanceof String)
                .map(obj ->(String) obj)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println("Elements Strings ordenats per longitud: " + strings);

    }
}
