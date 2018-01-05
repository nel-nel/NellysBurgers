package nellysburgers;

public enum Addition {
    CARROTS(0.5),
    LETTUCE(0.6),
    TOMATOE(0.7),
    EGG(0.8);
    public static int count = 0;
    private final double price;  
    Addition(double price) {
        this.price = price; 
        
    }
    public double additional_cost(){
        return this.price;
    }
}
