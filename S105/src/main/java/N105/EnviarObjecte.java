package N105;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EnviarObjecte implements Serializable {
    static void enviar(Object objecte) {
        try {
            ObjectOutputStream escrivintArxiu = new ObjectOutputStream(new FileOutputStream("C:/Users/Joan Carles/Intellij/Java/S105/src/main/java/N105/resultat.ser"));
            escrivintArxiu.writeObject(objecte);
            escrivintArxiu.close();
        } catch (Exception e) {}
    }
}
