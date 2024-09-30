package main.plants;

import main.plants.enums.Liquid;
import javax.swing.*;

public class Carnivorous extends Plant {

    public Carnivorous(String name, double heightInMeters) {
        super(name, heightInMeters);
        this.liquid = Liquid.PROTEINDRINK;
        this.baseAmountToDrink = 0.1;
    }

    public void printInstructions() {
        //JOptionPane här eller något
        JOptionPane.showMessageDialog(null, this.name +
                " is a carnivorous plant and needs " +
                (baseAmountToDrink + (baseAmountToDrink * 2 * heightInMeters)) +
                " liters of " + liquid.liquidName + " per day.");
    }

}
