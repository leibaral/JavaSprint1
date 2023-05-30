package N105;


import java.io.Serializable;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<Vehicle> objecte_a_enviar = new ArrayList<Vehicle>();
        objecte_a_enviar.add(new Cotxe("Seat", "Ibiza"));
        objecte_a_enviar.add(new Cotxe("Renault", "Avantime"));
        objecte_a_enviar.add(new Moto("Honda", "Scoopy"));

        EnviarObjecte.enviar(objecte_a_enviar);
        RebreObjecte.rebre();

    }

}

class Vehicle implements Serializable {
    private String marca;
    private String model;
    public Vehicle(String marca, String model){
        this.marca = marca;
        this.model = model;
    }
    public String toString(){
        return "Marca: " + marca + ", Model: " + model;
    }
}

class Cotxe extends Vehicle {
    private int rodes;
    private int volant;
    public Cotxe(String marca, String model){
        super(marca, model);
        this.rodes = 4;
        this.volant = 1;
    }
}
class Moto extends Vehicle {
    private int rodes;
    private int manillar;
    public Moto(String marca, String model){
        super(marca, model);
        this.rodes = 2;
        this.manillar = 1;
    }
}
