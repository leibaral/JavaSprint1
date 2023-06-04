package N101;

public class TreballadorPresencial extends Treballador{
    private static int benzina;

    public TreballadorPresencial(String nom, String cognom, int preuHora) {
        super(nom, cognom, preuHora);
    }
    @Override
    public int calcularSou(int horesTreballades){
    return super.calcularSou(horesTreballades) + benzina;
    }

    public static int getBenzina() {
        return benzina;
    }

    public static void setBenzina(int benzina) {
        TreballadorPresencial.benzina = benzina;
    }
}
