package N101;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream streamDeStringsAmbO = Stream.of("un", "dos", "tres", "quatre", "cinc", "sis", "set", "vuit", "nou", "deu")
                .filter(s -> s.contains("o"));
        List<String> llistaAmbO = (List<String>) streamDeStringsAmbO.collect(Collectors.toList());
        System.out.println(llistaAmbO);
    }
}
