public enum Liquid {

    TAPWATER("tap water"),
    MINERALWATER("mineral water"),
    PROTEINDRINK("protein drink");

    public final String liquidName;

    private Liquid(String l) {
        this.liquidName = l;
    }
}
