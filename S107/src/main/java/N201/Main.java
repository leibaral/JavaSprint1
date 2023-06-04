package N201;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        try{
            Persona persona1 = new Persona("Aitana Bonmatí", 23);
            String json = JSONSerializer.serializeObjectToJSON(persona1);
            ObjectOutputStream escrivintArxiu = new ObjectOutputStream(new FileOutputStream(JSONSerializer.getFilePath()));
            escrivintArxiu.writeObject(json);
            escrivintArxiu.close();
            System.out.println("Contingut de l'arxiu: " + json);

        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
