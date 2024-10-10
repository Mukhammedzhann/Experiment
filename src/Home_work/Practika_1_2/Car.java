package Home_work.Practika_1_2;

public class Car extends Vehicle {
    private int numberofDoors;
    private String transmissionType;

    public Car(String brand, String model, int year, int numberofDoors, String transmissionType) {
        super(brand, model, year);
        this.numberofDoors = numberofDoors;
        this.transmissionType = transmissionType;
    }
}

