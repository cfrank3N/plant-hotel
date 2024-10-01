package main.plants;

import main.plants.enums.Liquid;
import javax.swing.*;

public class Carnivorous extends Plant {

    public Carnivorous(String name, double heightInMeters) {
        super(name, heightInMeters);
        this.liquid = Liquid.PROTEINDRINK;
        this.baseAmountToDrink = 0.1;
    }

    @Override
    public double calculateAmountOfLiquid() {
        return baseAmountToDrink + (baseAmountToDrink * 2 * heightInMeters);
    }

    @Override
    public void printInstructions() {
        //JOptionPane här eller något
        JOptionPane.showMessageDialog(null, this.name +
                " is a carnivorous plant and needs " +
                this.calculateAmountOfLiquid() +
                " liters of " + liquid.getLiquidName() + " per day.");
    }

}
