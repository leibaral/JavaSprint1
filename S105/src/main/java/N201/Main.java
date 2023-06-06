package N201;

import N103.Escritura;
import N103.LlistaDirectori;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args){

        try {

            Properties prop = new Properties();
            prop.setProperty("directori_a_llegir", "src/main");
            prop.setProperty("nom_fitxer","resultat.txt" );
            prop.setProperty("ruta_fitxer","src/main" );

            prop.store(new FileWriter("Config.properties"),"exemple de Java Properties");

            File arxiuDesti = new File("src/main/resultat.txt");
            arxiuDesti.createNewFile();          //crea l'arxiu destí "resultat.txt" on s'escriuran els resultats
            Escritura.escriure("src/main/resultat.txt", LlistaDirectori.llistaDirectori("src/main"));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
