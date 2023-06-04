package N201;

import java.io.File;
import java.io.Serializable;
@SerializeToJSON(directory = "\\src\\main\\java\\N201")
public class Persona implements Serializable {
    private String nom;
    private int edat;

    public Persona(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }
}



