package main.plants;

import main.interfaces.Waterable;
import main.plants.enums.BaseLiquid;
import main.plants.enums.Liquid;

//Implementerar Interface i superklassen. Alla subklasser gör då detta automatiskt.
public abstract class Plant implements Waterable {

    protected double heightInMeters;
    protected String name;
    protected Liquid liquid;
    protected BaseLiquid baseLiquid;

    Plant(String name, double heightInMeters) {
        this.name = name;
        this.heightInMeters = heightInMeters;
    }

    public String getName() {
        return this.name;
    }
}
