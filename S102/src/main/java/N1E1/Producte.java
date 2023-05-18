package N1E1;
public class Producte {
    private String nomProd;
    private double preuProd = 0;
    public Producte(String nomProd, double preuProd){
        this.nomProd = nomProd;
        this.preuProd = preuProd;
    }

    public String getNomProd() {
        return nomProd;
    }
    public double getPreuProd() {
        return preuProd;
    }
    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }
    public void setPreuProd(double preuProd) {
        this.preuProd = preuProd;
    }

}
