package N105;

public class Main {
    public static void main(String[] args) {
        NombrePi pi = () -> 3.1415;
        System.out.println("El valor de PI és: " + pi.getPiValue());
    }
}
