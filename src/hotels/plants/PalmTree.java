package hotels.plants;

import hotels.plants.enums.BaseLiquidFor;
import javax.swing.*;

//Ärver Plant
public class PalmTree extends Plant {

    public PalmTree(String name, double heightInMeters) {
        super(name, heightInMeters);
        this.liquid = BaseLiquidFor.PALM_TREE;
    }

    @Override
    public double calculateAmountOfLiquid() {
        return liquid.getBaseAmountToDrink() * heightInMeters;
    }

    @Override
    public void printInstructions() {
        JOptionPane.showMessageDialog(null, this.name + " is a palm tree and needs " +
                this.calculateAmountOfLiquid() + " liter/s of " + liquid.getTypeOfLiquid() + " per day.");
    }

}
