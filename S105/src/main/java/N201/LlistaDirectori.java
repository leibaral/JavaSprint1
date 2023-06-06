package N201;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class LlistaDirectori {

    public static String llistaDirectori(String path) {

        File file = new File(String.valueOf(path));     //crea l'arxiu file amb el pathname que li hem passat "path"
        File[] pathList = file.listFiles();             //crea l'array pathList amb els arxius dins el path
        String bufferedResult = "";

        if (file.exists()) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Arrays.sort(pathList);

            for (File item : pathList) {
                if (item.isDirectory()) {
                    bufferedResult += ("\n");
                    bufferedResult += (
                            String.format("%s - %s - %s",
                                    item.getName(),
                                    " (D) ",
                                    sdf.format(item.lastModified())
                            ));
                    bufferedResult += ("\n ------------- \n");
                    bufferedResult += llistaDirectori(String.valueOf(item));
                } else {
                    bufferedResult += ("\n");
                    bufferedResult += (
                            String.format("%s - %s - %s",
                                    item.getName(),
                                    " (F) ",
                                    sdf.format(item.lastModified())
                            ));
                }
            }
        } else {
            System.out.println("No existeix el path");
        }

        return bufferedResult;
    }
}
