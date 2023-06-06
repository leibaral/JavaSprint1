package N1E1;
public class Main {
    public static void main(String[] args){
        Producte prod1 = new Producte("Jersei", 55);
        Producte prod2 = new Producte("Pantalons", 48);
        Producte prod3 = new Producte("Blusa", 83);
        Producte prod4 = new Producte("Mitjons", 20);

        try {
            Venda venda1 = new Venda();
            venda1.calcularTotal();       //no hi ha productes, ens ha de tirar el catch
            System.out.println(venda1.getTotal());
        } catch(ArrayIndexOutOfBoundsException | VendaBuidaException e){
            System.out.println(e.getMessage());
        }

        try {
            Venda venda2 = new Venda();
            venda2.afegirProd(prod1);
            venda2.afegirProd(prod2);
            venda2.afegirProd(prod3);
            venda2.afegirProd(prod4);
            venda2.calcularTotal();       //hi ha productes, ens agafa el try
            System.out.println(venda2.getTotal());
        } catch(ArrayIndexOutOfBoundsException | VendaBuidaException e){
            System.out.println(e.getMessage());
        }
    }
}
