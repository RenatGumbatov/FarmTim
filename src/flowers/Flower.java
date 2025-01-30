package flowers;

public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;

    @Override
    public String toString() {
        return "Flowers.Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

    static public Flower createFlower(int choice) {
        return switch (choice) {
            case 1 -> new Flower1();
            case 2 -> new Flower2();
            case 3 -> new Flower3();
            case 4 -> new Flower4();
            case 5 -> new Flower5();
            case 6 -> new Rose();
            default -> null;
        };
    }
}
