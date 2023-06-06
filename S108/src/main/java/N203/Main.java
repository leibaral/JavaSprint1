package N203;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n"+"Escull una operació:"+"\n"+"1 - Suma"+"\n"+"2 - Resta"+"\n"+"3 - Multiplicació"+"\n"+"4 - Divisió"+"\n");
        Scanner in = new Scanner(System.in);
        int opcio = in.nextInt();
        System.out.println("Num1:");
        float x = in.nextFloat();
        System.out.println("Num2:");
        float y = in.nextFloat();
        in.close();

        switch(opcio){

            case 1:
                Operacio suma = (a, b) -> a + b;
                System.out.println("\n"+"Suma: "+suma.operacio(x, y));
                break;
            case 2:
                Operacio resta = (a, b) -> a - b;
                System.out.println("\n"+"Resta: "+resta.operacio(x, y));
                break;
            case 3:
                Operacio multiplicacio = (a, b) -> a * b;
                System.out.println("\n"+"Multiplicació: "+multiplicacio.operacio(x, y));
                break;
            case 4:
                Operacio divisio = (a, b) -> a / b;
                System.out.println("\n"+"Divisio: "+divisio.operacio(x, y));
                break;
            default:
                System.out.println("Operació indefinida.");
                break;
        }
    }
}
