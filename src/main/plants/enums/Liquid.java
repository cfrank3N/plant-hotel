package main.plants.enums;

public enum Liquid {

    TAPWATER("tap water"),
    MINERALWATER("mineral water"),
    PROTEINDRINK("protein drink");

    private final String liquidName;

    Liquid(String l) {
        this.liquidName = l;
    }

    public String getLiquidName() {
        return liquidName;
    }
}
