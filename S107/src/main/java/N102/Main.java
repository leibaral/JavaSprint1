package N102;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Entra l'import de l'ajut per benzina per als treballadors presencials: ");
        TreballadorPresencial.setBenzina(input.nextInt());

        TreballadorPresencial tp1 = new TreballadorPresencial("Joan", "Martinez", 30);
        TreballadorOnline to1 = new TreballadorOnline("Pete", "McArthur", 28, 25);

        System.out.println("Sou d'un treballador presencial: " + tp1.calcularSou(160) + "€/mes");
        System.out.println("Sou d'un treballador online: " + to1.calcularSou(160) + "€/mes");
        System.out.println("\nFem servir el mateix mètode per al càlcul, però donen resultats diferents.");
        input.close();

        @SuppressWarnings("deprecation")
        class Sous2022 {
            public void calcularSous2022() {
                TreballadorPresencial tp1 = new TreballadorPresencial("Joan", "Martinez", 30);
                TreballadorOnline to1 = new TreballadorOnline("Pete", "McArthur", 28, 25);

                System.out.println("Sou d'un treballador presencial: " + tp1.calcularSou(160) + "€/mes");
                System.out.println("Sou d'un treballador online: " + to1.calcularSou(160) + "€/mes");
            }
        }
    }
}
