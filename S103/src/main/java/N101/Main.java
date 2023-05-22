package N101;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args){
        ArrayList<Month> llistaM = new ArrayList<Month>();
        llistaM.add(new Month("Gener"));
        llistaM.add(new Month("Febrer"));
        llistaM.add(new Month("Març"));
        llistaM.add(new Month("Abril"));
        llistaM.add(new Month("Maig"));
        llistaM.add(new Month("Juny"));
        llistaM.add(new Month("Juliol"));
        llistaM.add(new Month("Setembre"));
        llistaM.add(new Month("Octubre"));
        llistaM.add(new Month("Novembre"));
        llistaM.add(new Month("Desembre"));
        llistaM.add(new Month("Desembre"));

        llistaM.add(7,new Month("Agost"));

        System.out.println("");
        System.out.println("ARRAYLIST:");
        for(Month m : llistaM){
            System.out.println(m.getName());
        }

        HashSet<Month> hashM = new HashSet<Month>();
        hashM.addAll(llistaM);       //passem a HashSet

        System.out.println("");
        System.out.println("HASHSET for:");
        for(Month h : hashM){
            System.out.println(h.getName());
        }

        for(Month un : hashM){       //comprovem si hi ha repetits
            for(Month altre : hashM){
                if(un != altre && un.getName().equals(altre.getName())){
                    System.out.println(un.getName() + " està repetit");
                }
            }
        }


        System.out.println("");
        System.out.println("HASHSET iterador:");
        Iterator<Month> it = hashM.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getName());
        }
    }
}
