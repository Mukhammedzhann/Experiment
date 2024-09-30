package Practika.Practika_1_2;
public class Motorcycle extends Vehicle {
    private String bodyType;
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, int year, String bodyType, boolean hasSidecar) {
        super(brand, model, year);
        this.bodyType = bodyType;
        this.hasSidecar = hasSidecar;
    }
}

