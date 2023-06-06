package N105;

class Moto extends Vehicle {
    private int rodes;
    private int manillar;

    public Moto(String marca, String model) {
        super(marca, model);
        this.rodes = 2;
        this.manillar = 1;
    }
}
