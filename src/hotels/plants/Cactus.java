package hotels.plants;

import hotels.plants.enums.BaseLiquidFor;
import javax.swing.*;

//Ärver Plant
public class Cactus extends Plant {

    public Cactus(String name, double heightInMeters) {
        super(name, heightInMeters);
        this.liquid = BaseLiquidFor.CACTUS;
    }

    @Override
    public double calculateAmountOfLiquid() {
        return liquid.getBaseAmountToDrink();
    }

    @Override
    public void printInstructions() {
        JOptionPane.showMessageDialog(null, this.name + " is a Cactus, cacti always need "
                        + this.calculateAmountOfLiquid() + " liters of " + liquid.getTypeOfLiquid() + " per day, regardless of size.");
    }

}
