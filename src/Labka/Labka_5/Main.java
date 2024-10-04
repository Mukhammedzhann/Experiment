package Labka.Labka_5;



interface Transport {
    void Move();
    void FuelUp();
}
class Car implements Transport {
    private String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public void Move() {
        System.out.println("Driving a car: " + model + " at speed: " + speed + " km/h");
    }

    @Override
    public void FuelUp() {
        System.out.println("Refueling the car.");
    }
}

class Motorcycle implements Transport {
    private String model;
    private int speed;

    public Motorcycle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public void Move() {
        System.out.println("Riding a motorcycle: " + model + " at speed: " + speed + " km/h");
    }

    @Override
    public void FuelUp() {
        System.out.println("Refueling the motorcycle.");
    }
}

class Plane implements Transport {
    private String model;
    private int speed;

    public Plane(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public void Move() {
        System.out.println("Flying a plane: " + model + " at speed: " + speed + " km/h");
    }

    @Override
    public void FuelUp() {
        System.out.println("Refueling the plane.");
    }
}

class Bicycle implements Transport {
    private String model;
    private int speed;

    public Bicycle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public void Move() {
        System.out.println("Riding a bicycle: " + model + " at speed: " + speed + " km/h");
    }

    @Override
    public void FuelUp() {
        System.out.println("No fuel needed for the bicycle.");
    }
}
abstract class TransportFactory {
    public abstract Transport createTransport(String model, int speed);
}
class CarFactory extends TransportFactory {
    @Override
    public Transport createTransport(String model, int speed) {
        return new Car(model, speed);
    }
}

class MotorcycleFactory extends TransportFactory {
    @Override
    public Transport createTransport(String model, int speed) {
        return new Motorcycle(model, speed);
    }
}

class PlaneFactory extends TransportFactory {
    @Override
    public Transport createTransport(String model, int speed) {
        return new Plane(model, speed);
    }
}

class BicycleFactory extends TransportFactory {
    @Override
    public Transport createTransport(String model, int speed) {
        return new Bicycle(model, speed);
    }
}

enum AvtoType{
    Car, Motorcycle,Plane,Bicycle
}

class Program{
    public static Transport getTransport(AvtoType type,String model, int speed){
        TransportFactory factory = null;
        switch (type) {
            case Car:
                factory = new CarFactory();
                break;
            case Motorcycle:
                factory = new MotorcycleFactory();
                break;
            case Plane:
                factory = new PlaneFactory();
                break;
            case Bicycle:
                factory = new BicycleFactory();
                break;
            default:
                throw new IllegalArgumentException("Invalid document type");
        }
        return factory.createTransport(model, speed);
    }
}