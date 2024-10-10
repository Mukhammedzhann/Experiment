package Home_work.Practika_5_2;

interface IVehicle{
    void Drive();
    void Refuel();
}

 class Car implements IVehicle{
    private String brand;
    private String model;
    private String fuelType;

    public Car(String brand, String model, String fuelType){
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
    }
    @Override
    public void Drive() {
        System.out.println("Driving a car: " + brand + " " + model);
    }
    @Override
    public void Refuel() {
        System.out.println("Refueling car with " + fuelType);
    }
}


 class Motorcycle implements IVehicle{
    private String type;
    private int obyemdvigitel;

    public Motorcycle(String type,int obyemdvigitel){
        this.type = type;
        this.obyemdvigitel = obyemdvigitel;
    }

    @Override
    public void Drive() {
        System.out.println("Riding a " + type + " motorcycle with engine capacity: " + obyemdvigitel + "cc");
    }

    @Override
    public void Refuel() {
        System.out.println("Refueling motorcycle.");
    }
}

class Truck implements IVehicle{
    private int loadCapacity;
    private int colOsey;

    public Truck(int loadCapacity, int colOsey){
        this.loadCapacity = loadCapacity;
        this.colOsey = colOsey;
    }

    @Override
    public void Drive() {
        System.out.println("Driving a truck with load capacity: " + loadCapacity + "kg and " + colOsey + " axles.");
    }

    @Override
    public void Refuel() {
        System.out.println("Refueling truck.");    }
}

class Bus implements IVehicle{
    private int seatingCapacity;

    public Bus(int seatingCapacity){
        this.seatingCapacity = seatingCapacity;
    }
    @Override
    public void Drive() {
        System.out.println("Driving a bus with seating capacity: " + seatingCapacity);
    }

    @Override
    public void Refuel() {
        System.out.println("Refueling bus.");
    }
}

abstract class VehicleFactory {
    public abstract IVehicle createVehicle();
}
 class CarFactory extends VehicleFactory{
     private String brand;
     private String model;
     private String fuelType;

     public CarFactory(String brand, String model, String fuelType){
         this.brand = brand;
         this.model = model;
         this.fuelType = fuelType;
     }
     public IVehicle createVehicle() {
         return new Car(brand, model, fuelType);
     }
}

class MotorcycleFactory extends VehicleFactory{
    private String type;
    private int obyemdvigitel;

    public MotorcycleFactory(String type,int obyemdvigitel){
        this.type = type;
        this.obyemdvigitel = obyemdvigitel;
    }

    @Override
    public IVehicle createVehicle() {
        return new Motorcycle(type,obyemdvigitel);
    }
}

class TruckFactory extends VehicleFactory{
    private int loadCapacity;
    private int colOsey;

    public TruckFactory(int loadCapacity, int colOsey){
        this.loadCapacity = loadCapacity;
        this.colOsey = colOsey;
    }

    @Override
    public IVehicle createVehicle() {
        return new Truck(loadCapacity,colOsey);
    }
}

class BusFactory extends VehicleFactory{
    private int seatingCapacity;

    public BusFactory(int seatingCapacity){
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public IVehicle createVehicle() {
        return new Bus(seatingCapacity);
    }
}

enum AvtoType{
    Car, Motorcycle,Truck,Bus
}

class Program{
    public static IVehicle getVehicle(AvtoType type){
        VehicleFactory factory = null;
        switch (type) {
            case Car:
                factory = new CarFactory("Toyota", "Camry", "Petrol");
                break;
            case Motorcycle:
                factory = new MotorcycleFactory("Sport", 600);
                break;
            case Truck:
                factory = new TruckFactory(5000, 4);
                break;
            case Bus:
                factory = new BusFactory(50);
                break;
            default:
                throw new IllegalArgumentException("Invalid document type");
        }
        return factory.createVehicle();
    }
}

