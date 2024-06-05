package n1exercici8;

public class Main {
    public static void main(String[] args){

        Reverse reverse = s -> new StringBuilder(s).reverse().toString();

        String exemple = "Prova del mètode";
        String resultat = reverse.reverse(exemple);

        System.out.println("Cadena original: " + exemple);
        System.out.println("Cadena invertida: " + resultat);
    }
}
