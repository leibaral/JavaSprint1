package N101;

import java.io.File;
import java.util.Arrays;

public class LlistaDirectori {
    public static void main(String[] args) {

        File path = new File(".");

        if (!path.isDirectory()) {
            System.out.println("El camí especificat no és un path vàlid.");
            return;
        }

        String[] contingut = path.list();
        Arrays.sort(contingut);

        for (String element : contingut) {
            System.out.println(element);
        }
    }
}
