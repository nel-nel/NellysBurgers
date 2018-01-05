package nellysburgers;


    
public class Hamburger {
    private Meat meat;
    private Bread bread; 
    private final static double BASEPRICE = 5;
    private double finalPrice;  

    public Hamburger(Meat meat,Bread bread) {
            this.meat = meat;
            this.bread = bread;
            this.finalPrice += BASEPRICE;
        }
    
  public double add(Addition addition){
      if(Addition.count>=4){
          System.out.println("More than 4 additions can't be done!But you can have another burger!");
      }else{
      addition.count++;
      double add_cost = addition.additional_cost();
      this.finalPrice+=add_cost;
      System.out.printf("Additional cost for the %s is:%f%n\nFinal cost is %f%n \n",addition.toString(),add_cost,finalPrice);
      return add_cost;
      }
        return 0;
     
  }
    
    
}
