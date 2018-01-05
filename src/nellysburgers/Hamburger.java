package nellysburgers;
/*The basic hamburger should have the following items.
        // bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
        // the customer can select to be added to the burger. Each one of these items gets charged an additional
        // price so you need some way to track how many items got added and to calculate the price (for the base
        // burger and all the additions).
         // This burger has a base price and the additions are all seperately priced.
        // Create a Hamburger class to deal with all the above.
        // The constructor should only include the roll type and meat type 
*/

    
    
public class Hamburger {
    private Meat meat;
    private Bread bread; 
    private final static double BASEPRICE = 5;
    private double finalPrice;
    private StringBuilder added ;
    private int countAdditions; 
        
    public Hamburger(Meat meat,Bread bread) {
            this.meat = meat;
            this.bread = bread;
            this.finalPrice = BASEPRICE;
            added = new StringBuilder();
            countAdditions = 0; 
            System.out.println("Ordering a burger. Wanna have some additions?");
        }
    
  public void add(Addition addition){
       if(countAdditions>=4){
          System.out.println("You can't add more than 4 additions per Burger!");
      }else{
      countAdditions++;         
      double additionCost = addition.additional_cost();
      this.finalPrice+=additionCost;
      System.out.printf("%s is added for an extra:%f%n\nFinal cost: %f%n \n",addition.toString(),additionCost,finalPrice);
      added.append(" " + addition.toString()+",");
      }
    }
    
  public double finalizeOrder(){
      System.out.printf("ORDER FINALIZED!\nAdditions:%s \nFinal cost: %f%n.\r", added, finalPrice);
      return this.finalPrice;
  }  
}
