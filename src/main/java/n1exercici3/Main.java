package n1exercici3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<String> mesosAny = Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol",
                "Agost", "Setembre", "Octubre", "Novembre", "Desembre");

        mesosAny.forEach(element -> System.out.println(element));
    }
}
