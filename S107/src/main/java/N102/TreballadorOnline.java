package N102;

public class TreballadorOnline extends Treballador {
    private final int TARIFAPLANA;

    public TreballadorOnline(String nom, String cognom, int preuHora, int TARIFAPLANA) {
        super(nom, cognom, preuHora);
        this.TARIFAPLANA = TARIFAPLANA;
    }

    @Override
    public int calcularSou(int horesTreballades){
    return super.calcularSou(horesTreballades) + TARIFAPLANA;
    }

    @Deprecated
    public int calcularSou2022(int horesTreballades){
        return super.calcularSou(horesTreballades) + TARIFAPLANA;
    }
}
