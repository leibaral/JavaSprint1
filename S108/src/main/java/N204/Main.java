package N204;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> llista = new ArrayList<>();
        llista.addAll(Arrays.asList("Hola", "món", 2023, "Romina", "Enric", "MediaTIC", 1, "Barcelona", 33));

        System.out.println("\n" + "1. Ordenat pel primer caracter" + "\n");
        llista.sort(Comparator.comparing(s -> s.toString().charAt(0)));
        llista.forEach(System.out::println);

        System.out.println("\n");
        System.out.println("2. Primer els que comencen per 'e'" + "\n");
        llista.stream().filter(s -> s.toString().startsWith("e")).forEach(System.out::println);
        llista.stream().filter(s -> s.toString().startsWith("E")).forEach(System.out::println);
        llista.stream().filter(s -> !s.toString().startsWith("E")).forEach(System.out::println);

        System.out.println("\n");
        System.out.println("3. Canviem 'a' per '4'" + "\n");
        llista.forEach(s -> System.out.println(s.toString().replace("a", "4")));

        System.out.println("\n");
        System.out.println("4. Només les cadenes numèriques" + "\n");
        llista.stream().filter(s -> StringUtils.isNumeric(s.toString())).forEach(System.out::println);
    }
}
