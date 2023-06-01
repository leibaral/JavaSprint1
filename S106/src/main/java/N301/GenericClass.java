package N301;

public class GenericClass {
    public static <T extends Telefon> void genericMethod1(Telefon t){
        Telefon.trucar();
        //Telefon.ferFotos(); //el mètode ferFotos() no pot ser cridat des de la interfase Telefon
    }
    public static <T extends Smartphone> void genericMethod2(Smartphone t){
        t.trucar();
        t.ferFotos();
    }
}
