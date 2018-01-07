/*
 // b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
        // hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
        // object is created, and then prevent other additions being made.
 */
package nellysburgers;

import static nellysburgers.Addition.DRINK;
import static nellysburgers.Addition.CHIPS;

public class DeluxBurger extends Hamburger{  
    public DeluxBurger(Meat meat, Bread bread) {
        super(meat, bread,4,2);// baseprice is 4$, only 2 (chips and drinks) additions allowed 
        // adding chips and drinks automatically
        super.add(CHIPS);
        super.add(DRINK);  
    }
    
}
