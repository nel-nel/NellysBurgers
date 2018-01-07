package nellysburgers;

public enum Meat implements Extras {
    CHICKEN(2), PORK(3), BEEF(4.0), NO_MEAT(0);
    private final double price;

    Meat(double price) {
        this.price = price;
    }

    @Override
    public double getCost() {
        return this.price;
    }

};
