package N102;

import java.util.*;


public class Main {

    public static void main(String[] args){

        List<Integer> llista1 = new ArrayList<Integer>();

        llista1.add(1);
        llista1.add(2);
        llista1.add(3);
        llista1.add(4);
        llista1.add(5);
        llista1.add(6);
        llista1.add(7);
        llista1.add(8);
        llista1.add(9);
        llista1.add(10);

        List<Integer> llista2 = new ArrayList<Integer>();
        ListIterator<Integer> it = llista1.listIterator(llista1.size());
        while(it.hasPrevious()){
            llista2.add(it.previous());
        }
        System.out.println(llista1);
        System.out.println(llista2);
    }

}
