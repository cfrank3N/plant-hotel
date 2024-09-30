public abstract class Plant implements Waterable {

    protected double heightInMeters;
    protected String name;
    protected Liquid liquid;
    protected double baseAmountToDrink;

    Plant(String name, double heightInMeters) {
        this.name = name;
        this.heightInMeters = heightInMeters;
    }
}
