package N104;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> mesos = Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre");
        mesos.forEach(Main::imprimir);
    }
    public static void imprimir(String mes){
        System.out.println(mes);
    }
}
