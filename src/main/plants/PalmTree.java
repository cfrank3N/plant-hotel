package main.plants;

import main.plants.enums.BaseLiquid;
import main.plants.enums.Liquid;
import javax.swing.*;

//Ärver Plant
public class PalmTree extends Plant {

    public PalmTree(String name, double heightInMeters) {
        super(name, heightInMeters);
        this.liquid = Liquid.TAPWATER;
        this.baseLiquid = BaseLiquid.PALM_TREE;
    }

    @Override
    public double calculateAmountOfLiquid() {
        return baseLiquid.getBaseAmountToDrink() * heightInMeters;
    }

    @Override
    public void printInstructions() {
        JOptionPane.showMessageDialog(null, this.name + " is a palm tree and needs " +
                this.calculateAmountOfLiquid() + " liter/s of " + liquid.getLiquidName() + " per day.");
    }

}
