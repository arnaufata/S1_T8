package n1exercici5;

public class Main {
    public static void main(String[] args){

        PiValue pi = () -> 3.1415;

        System.out.println("El valor del número PI és: " + pi.getPiValue());
    }
}
