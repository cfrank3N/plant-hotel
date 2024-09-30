package hotels;

import plants.Plant;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Plant> plants = new ArrayList<>();

    public void addPlants(List<Plant> plants) {
        this.plants = plants;
    }

    public List<Plant> getPlants() {
        return plants;
    }
}
