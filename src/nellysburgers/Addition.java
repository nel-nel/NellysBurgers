package nellysburgers;

public enum Addition implements Extras {
    CARROTS(0.5),
    LETTUCE(0.6),
    TOMATOE(0.7),
    EGG(0.8),
    PEPPER(0.5),
    CHIPS(3.0),
    DRINK(2.0);
    private double price;

    Addition(double price) {
        this.price = price;
    }

    @Override
    public double getCost() {
        //addition cost
        return this.price;
    }

    @Override
    public void changePrice(double newPrice) {
        this.price = newPrice;
    }
}
