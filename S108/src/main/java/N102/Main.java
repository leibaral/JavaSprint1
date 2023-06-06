package N102;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        Stream streamDeStringsAmbOMesDe5 = Stream.of("Armando", "Federico", "Pedro", "Javier", "Vicente", "Manuel", "Joana", "Lluisa", "Eustaqui", "Felisa")
                .filter(s -> s.contains("o"))
                .filter(s -> s.length()>5);
        List<String> llistaAmbOMesDe5 = (List<String>) streamDeStringsAmbOMesDe5.collect(Collectors.toList());
        System.out.println(llistaAmbOMesDe5);
    }
}
