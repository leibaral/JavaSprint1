package N201;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> noms = new ArrayList<>();
        noms.add("Ana");
        noms.add("Anna");
        noms.add("Marcel");
        noms.add("Joana");
        noms.add("Lluis");
        noms.add("Ricard");
        noms.add("Ada");

        noms.stream().filter(x -> x.startsWith("A")).filter(x -> x.length()==3).forEach(System.out::println);
    }
}
