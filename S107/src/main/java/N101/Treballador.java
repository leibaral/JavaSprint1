package N101;

public class Treballador {
    private String nom;
    private String cognom;
    private int preuHora;

    public Treballador(String nom, String cognom, int preuHora) {
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }
    public int calcularSou(int horesTreballades){
        return this.preuHora*horesTreballades;
    }
}
