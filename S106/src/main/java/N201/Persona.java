package N201;

public class Persona {
    private String nom;
    private String cognom;
    private int edat;

    public Persona(String nom, String cognom, int edat) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }
    public String toString(){
        return "Nom: "+ nom +"  Cognom: "+ cognom +"  Edat: "+ edat;
    }
}
