package N102;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class LlistaDirectori {
    public static void llistaDirectori(String path) {
        System.out.println(path);


        File file = new File(String.valueOf(path));     //crea l'arxiu file amb el pathname que li hem passat "path"
        File[] pathList = file.listFiles();             //crea l'array pathList amb els arxius dins el path

        if (file.exists()) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Arrays.sort(pathList);

            for (File item: pathList) {
                if(item.isDirectory()){
                    System.out.println(
                            String.format("%s - %s - %s",
                            item.getName(),
                            " (D) ",
                            sdf.format(item.lastModified())
                    ));
                    System.out.println("-------------");
                    llistaDirectori(String.valueOf(item));
                } else {
                    System.out.println(
                            String.format("%s - %s - %s",
                            item.getName(),
                            " (F) ",
                            sdf.format(item.lastModified())
                    ));
                }
            }
        }
        else {
            System.out.println("No existeix el path");
        }
    }
}
