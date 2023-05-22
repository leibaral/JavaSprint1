package N103;
import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.*;
import java.util.Random;



public class Main {

    public static void main(String[] args){
        String parellaTrobada;
        HashMap<String, String> parelles = new HashMap<String, String>();

        Scanner input = new Scanner(System.in);
        System.out.println("Introdueix el teu nom: ");
        String nom = input.nextLine();

        try{
            FileReader fr = new FileReader("C:/Users/Joan Carles/IntelliJ/Java/S103/src/main/java/N103/Countries.txt");
            BufferedReader br = new BufferedReader(fr);
            while((parellaTrobada=br.readLine()) != null){
                String[] paraula = parellaTrobada.split(" ");
                parelles.put(paraula[0], paraula[1]);
            }

            List<String> llistaClaus = new ArrayList<String>(parelles.keySet());     //passem HashMap a Array que SÍ està ordenat

            int puntuacio = 0;
            for(int i=0; i<=9; i++){
                Random rnd = new Random();
                int numPais = rnd.nextInt(10)+1;       //la llista és de 10 països
                System.out.println(nom+", quina és la capital de "+llistaClaus.get(numPais)+"?");
                String capitalResposta = input.nextLine();
                if(capitalResposta.equals(parelles.get(llistaClaus.get(numPais)))){
                    System.out.println("Correcte!");
                    puntuacio += 1;
                } else {
                    System.out.println("Incorrecte. Era "+parelles.get(llistaClaus.get(numPais)));
                }
            }
            try {
                File classificacio = new File("C:/Users/Joan Carles/IntelliJ/Java/S103/src/main/java/N103/Classificacio.txt");
                if (classificacio.createNewFile()) {
                    System.out.println("Arxiu creat: " + classificacio.getName());
                    FileWriter fw = new FileWriter("C:/Users/Joan Carles/IntelliJ/Java/S103/src/main/java/N103/Classificacio.txt");
                    fw.write(nom+" : "+puntuacio);
                    fw.close();
                } else {
                    System.out.println("L'arxiu ja existeix.");
                }
            } catch (IOException e) {
                System.out.println("S'ha produit un error.");
                e.printStackTrace();
            }

        } catch(IOException e){
            System.out.println("No s'ha trobat el fitxer");
        }


    }

}
