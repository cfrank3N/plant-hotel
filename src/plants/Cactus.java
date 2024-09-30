package plants;

import enums.Liquid;
import javax.swing.*;

public class Cactus extends Plant {

    public Cactus(String name, double heightInMeters) {
        super(name, heightInMeters);
        this.liquid = Liquid.MINERALWATER;
        this.baseAmountToDrink = 0.02;
    }

    public void printInstructions() {
        //JOptionPane här eller något
        JOptionPane.showMessageDialog(null, this.name + " is a Cactus, cacti always need "
                        + baseAmountToDrink + " liters of " + liquid.liquidName + " per day, regardless of size.");
    }

}
