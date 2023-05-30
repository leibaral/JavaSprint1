package N104;

import java.io.FileReader;
import java.io.IOException;

public class LlegirArxiu {

    public static void llegirArxiu(String pathNom){
        try{
            FileReader entrada = new FileReader(pathNom);
            int e = entrada.read();

            while(e!=-1) {
                e = entrada.read();
                char lletra = (char) e;
                if(e!=-1){
                    System.out.print(lletra);
                }
            entrada.close();
            }
        } catch (IOException e) {
            System.out.println("No s'ha trobat el fitxer TXT");
        }
    }

}
