package N103;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
        try {
            File arxiuDesti = new File("C:/Users/Joan Carles/Intellij/Java/S105/src/main/resultat.txt");
            arxiuDesti.createNewFile();          //crea l'arxiu destí "resultat.txt" on s'escriuran els resultats
            Escriure.escriure("C:/Users/Joan Carles/Intellij/Java/S105/src/main/resultat.txt", LlistaDirectori.llistaDirectori("C:/Users/Joan Carles/Intellij/Java/S105/src/main"));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
