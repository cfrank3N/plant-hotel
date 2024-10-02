package hotels.plants.enums;


public enum BaseLiquidFor {
    CACTUS(0.02, "mineral water"),
    PALM_TREE(0.5, "tap water"),
    CARNIVOROUS(0.1, "protein drink");

    //Inkapsling
    private final double baseAmountToDrink;
    private final String typeOfLiquid;

    BaseLiquidFor(double baseAmountToDrink, String typeOfLiquid) {
        this.baseAmountToDrink = baseAmountToDrink;
        this.typeOfLiquid = typeOfLiquid;
    }

    //Inkapsling. Man kan bara komma åt enumens privata värden, men inte ändra dem.
    public double getBaseAmountToDrink() {
        return baseAmountToDrink;
    }

    public String getTypeOfLiquid() {
        return typeOfLiquid;
    }
}
