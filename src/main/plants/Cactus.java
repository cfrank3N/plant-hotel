package main.plants;

import main.plants.enums.BaseLiquid;
import main.plants.enums.Liquid;
import javax.swing.*;

//Ärver Plant
public class Cactus extends Plant {

    public Cactus(String name, double heightInMeters) {
        super(name, heightInMeters);
        this.liquid = Liquid.MINERALWATER;
        this.baseLiquid = BaseLiquid.CACTUS;
    }

    @Override
    public double calculateAmountOfLiquid() {
        return baseLiquid.getBaseAmountToDrink();
    }

    @Override
    public void printInstructions() {
        JOptionPane.showMessageDialog(null, this.name + " is a Cactus, cacti always need "
                        + this.calculateAmountOfLiquid() + " liters of " + liquid.getLiquidName() + " per day, regardless of size.");
    }

}
