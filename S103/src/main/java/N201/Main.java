package N201;
import java.sql.SQLOutput;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Integer numRestaurants = 0;
        HashSet<String> llistaClausRestaurants = new HashSet<String>();
        HashMap<String, Integer> llistaRestaurants = new HashMap<String, Integer>();

        Scanner input = new Scanner(System.in);
        boolean segueix = true;
        char nou;

        while(segueix) {
            System.out.println("Nom del restaurant :");
            String nom = input.nextLine();
            System.out.println("Puntuació :");
            Integer punts = input.nextInt();
            String clauUnica = nom + " " + punts.toString();
            input.nextLine();

            if (!llistaClausRestaurants.contains(clauUnica)) {
                llistaClausRestaurants.add(clauUnica);
                Restaurant nouRest = new Restaurant(nom, punts);
                llistaRestaurants.put(nouRest.getNom(), nouRest.getPunts());
                numRestaurants += 1;

            } else if (llistaClausRestaurants.contains(clauUnica)) {
                System.out.println("Restaurant amb puntuació repetida");
            }
            Scanner in = new Scanner(System.in);
            System.out.println("Nou restaurant? S/N");
            nou = in.nextLine().charAt(0);
            if (nou == 'N') {
                segueix = false;
            }

        }
        for(String i:llistaRestaurants.keySet()){
                System.out.println(i + ": " + llistaRestaurants.get(i));
        }
    }

}
