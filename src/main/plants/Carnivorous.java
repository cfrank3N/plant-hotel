package main.plants;

import main.plants.enums.BaseLiquid;
import main.plants.enums.Liquid;
import javax.swing.*;

public class Carnivorous extends Plant {

    //Constructor använder sig av superklassens protectade instansvariabler.
    public Carnivorous(String name, double heightInMeters) {
        super(name, heightInMeters);
        this.liquid = Liquid.PROTEINDRINK;
        this.baseLiquid = BaseLiquid.CARNIVOROUS;
    }

    // Interfacets metoder nedan:
    @Override
    public double calculateAmountOfLiquid() {
        return baseLiquid.getBaseAmountToDrink() + (baseLiquid.getBaseAmountToDrink() * 2 * heightInMeters);
    }

    @Override
    public void printInstructions() {
        JOptionPane.showMessageDialog(null, this.name +
                " is a carnivorous plant and needs " +
                this.calculateAmountOfLiquid() +
                " liters of " + liquid.getLiquidName() + " per day.");
    }

}
