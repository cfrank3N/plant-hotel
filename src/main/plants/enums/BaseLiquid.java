package main.plants.enums;

public enum BaseLiquid {
    CACTUS(0.02),
    PALM_TREE(0.5),
    CARNIVOROUS(0.1);

    private final double baseAmountToDrink;

    BaseLiquid(double baseAmountToDrink) {
        this.baseAmountToDrink = baseAmountToDrink;
    }

    public double getBaseAmountToDrink() {
        return baseAmountToDrink;
    }
}
