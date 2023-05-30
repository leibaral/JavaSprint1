package N103;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escriure {
    public static void escriure(String ruta_arxiu, String contingut){

        try{
            FileWriter escrit = new FileWriter(ruta_arxiu);

            for (int i=0; i<contingut.length(); i++){
                escrit.write(contingut.charAt(i));
            }
            escrit.close();
        } catch (IOException e){

        }
    }

}
