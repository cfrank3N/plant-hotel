import javax.swing.*;

public class PalmTree extends Plant{

    public PalmTree(String name, double heightInMeters) {
        super(name, heightInMeters);
        this.liquid = Liquid.TAPWATER;
        this.baseAmountToDrink = 0.5;
    }

    public void printInstructions() {
        JOptionPane.showMessageDialog(null, this.name + " is a palm tree and needs " +
                this.baseAmountToDrink * heightInMeters + " liter/s of " + liquid.liquidName + " per day.");
    }

}
