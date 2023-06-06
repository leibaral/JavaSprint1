package N108;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Entra un texte: ");
        String cadenaDret = in.nextLine();

        StringReverser reverser = str -> {                  //instanciem la interfície...
            StringBuilder builder = new StringBuilder(str); //...i és aquí on, gràcies a la classe StringBuilder...
            return builder.reverse().toString();            //...li diem què ha de fer.
        };

        String cadenaReves = reverser.reverse(cadenaDret);   //li passem la cadena a la instància
        System.out.println(cadenaReves);
    }
}
