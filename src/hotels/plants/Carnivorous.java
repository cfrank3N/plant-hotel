package hotels.plants;

import hotels.plants.enums.BaseLiquidFor;
import javax.swing.*;

//Ärver Plant
public class Carnivorous extends Plant {

    //Constructor använder sig av superklassens protectade instansvariabler.
    public Carnivorous(String name, double heightInMeters) {
        super(name, heightInMeters);
        this.liquid = BaseLiquidFor.CARNIVOROUS;
    }

    // Interfacets metoder nedan:
    @Override
    public double calculateAmountOfLiquid() {
        return liquid.getBaseAmountToDrink() + (liquid.getBaseAmountToDrink() * 2 * heightInMeters);
    }

    @Override
    public void printInstructions() {
        JOptionPane.showMessageDialog(null, this.name +
                " is a carnivorous plant and needs " +
                this.calculateAmountOfLiquid() +
                " liters of " + liquid.getTypeOfLiquid() + " per day.");
    }

}
