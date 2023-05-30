package N201;

import N103.Escriure;
import N103.LlistaDirectori;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args){

        try {

            Properties prop = new Properties();
            prop.setProperty("directori_a_llegir", "C:/Users/Joan Carles/Intellij/Java/S105/src/main");
            prop.setProperty("nom_fitxer","resultat.txt" );
            prop.setProperty("ruta_fitxer","C:/Users/Joan Carles/Intellij/Java/S105/src/main" );

            prop.store(new FileWriter("Config.properties"),"exemple de Java Properties");

            File arxiuDesti = new File("C:/Users/Joan Carles/Intellij/Java/S105/src/main/resultat.txt");
            arxiuDesti.createNewFile();          //crea l'arxiu destí "resultat.txt" on s'escriuran els resultats
            Escriure.escriure("C:/Users/Joan Carles/Intellij/Java/S105/src/main/resultat.txt", LlistaDirectori.llistaDirectori("C:/Users/Joan Carles/Intellij/Java/S105/src/main"));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
