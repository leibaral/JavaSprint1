package N106;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Object> llista1 = Arrays.asList(0, 1, "BB", "DDDD", 4, 3, "CCC", "A");
        List<String> llistaStrings = new ArrayList<>();
        List<Object> novaLlista = new ArrayList<>();
        for (int i =0; i<llista1.size(); i++){
            if (llista1.get(i) instanceof String){
                llistaStrings.add((String)llista1.get(i));
            }
        }
        llistaStrings.sort(Comparator.comparing(String::length)); //Compara llargada i ordena de +curt a +llarg
        int k = 0;
        for (int j=0; j<llista1.size(); j++){
            if (llista1.get(j) instanceof String){
                novaLlista.add(j, llistaStrings.get(k));
                k++;
            } else {
                novaLlista.add(j, llista1.get(j));
            }
        }
        System.out.println(novaLlista);


    }
}
