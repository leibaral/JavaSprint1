package N105;

import java.io.Serializable;

class Vehicle implements Serializable {
    private String marca;
    private String model;

    public Vehicle(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public String toString() {
        return "Marca: " + marca + ", Model: " + model;
    }
}
