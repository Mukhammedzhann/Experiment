package Practika.Practika_1_2;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Vehicle> vehicles;

    public Garage() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Транспортное средство добавлено.");
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
        System.out.println("Транспортное средство удалено.");
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
