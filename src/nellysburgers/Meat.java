package nellysburgers;

public enum Meat implements Extras {
    CHICKEN(2.0), PORK(3.0), BEEF(4.0), NO_MEAT(0.0);
    private double price;

    Meat(double price) {
        this.price = price;
    }

    @Override
    public double getCost() {
        //Meat cost
        return this.price;
    }
   
    @Override
    public void changePrice(double newPrice) {
        this.price = newPrice;
    }
};
