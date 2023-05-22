package N202;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Integer numRestaurants = 0;
        HashSet<String> llistaClausRestaurants = new HashSet<String>();     //Guardem claus úniques a un HashSet per comprovar que no es repeteixin
        HashMap<String, Integer> llistaRestaurants = new HashMap<String, Integer>();  //Guardem nom/puntuació a un HashMap per poder accedir a les dades

        Scanner input = new Scanner(System.in);
        boolean segueix = true;
        char nou;

        while(segueix) {
            System.out.println("Nom del restaurant :");
            String nom = input.nextLine();
            System.out.println("Puntuació :");
            Integer punts = input.nextInt();
            String clauUnica = nom + " " + punts.toString();     //Clau única
            input.nextLine();

            if (!llistaClausRestaurants.contains(clauUnica)) {    //comprovem que no estigui ja creada la clau
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
        SortedMap<String, Integer> sortedRest = new TreeMap<>();
        for(String i:llistaRestaurants.keySet()){
            sortedRest.put(i, llistaRestaurants.get(i));  //introduim els resultats al SorteMap
        }
        for(String clau : sortedRest.keySet()){
            System.out.println(clau + ": " + sortedRest.get(clau));
        }
    }

}
