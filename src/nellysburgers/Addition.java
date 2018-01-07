package nellysburgers;

public enum Addition implements Extras{
    CARROTS(0.5),
    LETTUCE(0.6),
    TOMATOE(0.7),
    EGG(0.8),
    PEPPER(0.5),
    CHIPS(2.0),
    DRINK(1.0);
    private final double price;  
    Addition(double price) {
        this.price = price;        
    } 
    @Override
 public double getCost(){
     return this.price;
 }
    
}
