package N102;

import java.util.ArrayList;

public class CalculoDNI {
    private int dni;
    public String dniComplet;
    private static String lletras = "TRWAGMYFPDXBNJZSQVHLCKE";
    public CalculoDNI(int dni){
        this.dni = dni;
        char lletra = lletras.charAt(dni % lletras.length());
        dniComplet = "" + dni + lletra;
    }
}
