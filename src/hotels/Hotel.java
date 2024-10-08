package hotels;

import hotels.plants.Plant;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Plant> plants = new ArrayList<>();

    public Hotel(List<Plant> plants) {
        this.addPlants(plants);
    }
    public void addPlants(List<Plant> plants) {
        for (Plant p : plants) {
            this.plants.add(p);
        }
    }

    public List<Plant> getPlants() {
        return plants;
    }
}
