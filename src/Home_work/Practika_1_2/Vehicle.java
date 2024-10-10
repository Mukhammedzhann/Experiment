package Home_work.Practika_1_2;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + year + ")";
    }

    public void startEngine() {
        System.out.println("Двигатель " + brand + " " + model + " запущен.");
    }

    public void stopEngine() {
        System.out.println("Двигатель " + brand + " " + model + " остановлен.");
    }
}
