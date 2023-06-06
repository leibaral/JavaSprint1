package N103;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
        try {
            File arxiuDesti = new File("src/main/resultat.txt");
            arxiuDesti.createNewFile();          //crea l'arxiu destí "resultat.txt" on s'escriuran els resultats
            Escritura.escriure("src/main/resultat.txt", LlistaDirectori.llistaDirectori("src/main"));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
