package N105;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<Vehicle> objecte_a_enviar = new ArrayList<Vehicle>();
        objecte_a_enviar.add(new Cotxe("Seat", "Ibiza"));
        objecte_a_enviar.add(new Cotxe("Renault", "Avantime"));
        objecte_a_enviar.add(new Moto("Honda", "Scoopy"));

        EnviamentObjecte.enviar(objecte_a_enviar);
        RecepcioObjecte.rebre();

    }

}

