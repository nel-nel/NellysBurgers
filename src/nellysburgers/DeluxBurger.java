/*
 // b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
       find a way to automatically add these new additions at the time the deluxe burger
       object is created
 */
package nellysburgers;

import static nellysburgers.Addition.DRINK;
import static nellysburgers.Addition.CHIPS;

public class DeluxBurger extends Hamburger {

    public DeluxBurger(Meat meat, Bread bread, int basePrice, int maxAdditions) {
        super(meat, bread, basePrice, maxAdditions);
        // adding chips and drinks automatically
        
        Addition deluxChips = CHIPS;
        Addition deluxDrink = DRINK;
        deluxChips.changePrice(0.0);//PROMOTION!! 
        deluxDrink.changePrice(0.0);//PROMOTION!!
        super.add(CHIPS);
        super.add(DRINK);
    }
}
