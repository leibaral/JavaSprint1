package N1E1;
import java.util.ArrayList;
import java.util.List;
public class Venda {
    private double total;
    public List<Producte> llistaProductes;

    public Venda() {
        this.llistaProductes = new ArrayList<Producte>();
        this.total = 0;
    }

    public double getTotal() {
        return total;
    }

    public double calcularTotal() throws VendaBuidaException {
        if (llistaProductes.isEmpty()){
            throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
        } else {
            for(Producte producte : llistaProductes){
                total += producte.getPreuProd();
            }
        return total;
        }
    }

    public void afegirProd(Producte producte){
        llistaProductes.add(producte);
    }
}
