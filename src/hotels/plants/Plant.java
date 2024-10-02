package hotels.plants;

import hotels.interfaces.Waterable;
import hotels.plants.enums.BaseLiquidFor;

//Implementerar Interface i superklassen. Alla subklasser gör då detta automatiskt.
public abstract class Plant implements Waterable {

    //Inkapsling, endast subklasserna i detta paket kommer åt dessa variabler.
    //Har även använt mig av paket.
    protected double heightInMeters;
    protected String name;
    protected BaseLiquidFor liquid;

    Plant(String name, double heightInMeters) {
        this.name = name;
        this.heightInMeters = heightInMeters;
    }

    public String getName() {
        return this.name;
    }
}
