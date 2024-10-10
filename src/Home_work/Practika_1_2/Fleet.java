package Home_work.Practika_1_2;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private List<Garage> garages;

    public Fleet() {
        garages = new ArrayList<>();
    }

    public void addGarage(Garage garage) {
        garages.add(garage);
        System.out.println("Гараж добавлен.");
    }

    public void removeGarage(Garage garage) {
        garages.remove(garage);
        System.out.println("Гараж удален.");
    }

    public List<Garage> getGarages() {
        return garages;
    }
}

