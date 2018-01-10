package nellysburgers;

import static nellysburgers.Addition.*;
import static nellysburgers.Bread.*;
import static nellysburgers.Meat.*;


/*The purpose of the application is to help a ficticious company called Nellys Burgers to manage
        // their process of selling hamburgers.
        // Our application will help Nelly to select types of burgers, some of the additional items (additions) to
        // be added to the burgers and pricing.
        // We want to create a base hamburger, but also two other types of hamburgers
        // The basic hamburger should have the following items.
        // bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
        // the customer can select to be added to the burger. Each one of these items gets charged an additional
        // price so you need some way to track how many items got added and to calculate the price (for the base
        // burger and all the additions).
        // This burger has a base price and the additions are all seperately priced.
        // Create a Hamburger class to deal with all the above.
        // The constructor should only include the roll type, meat type 
        // Also create two extra varieties of Hamburgers (classes) to cater for
        // a) Healthy burger (on a brown rye bread roll)
        // The healthy burger can have a total of 6 items (Additions) in total.
        // b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
        //find a way to automatically add these new additions at the time the deluxe burger
        // object is created, and then prevent other additions being made.
        //  All 3 classes have a method FinalizeOrder that shows the base price of the hamburger
        // plus all additionals, each showing the addition name, and addition price, and a grand total for the
        // burger*/
public class NellysBurgers {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hamburger hamburger1 = new Hamburger(PORK, WHITE, 3, 4);
        hamburger1.add(Addition.TOMATOE);
        hamburger1.add(Addition.TOMATOE);
        hamburger1.add(Addition.TOMATOE);
        hamburger1.finalizeOrder();
        Hamburger hamburger2 = new Hamburger(PORK, WHITE, 3, 4);
        hamburger2.add(LETTUCE);
        hamburger2.add(LETTUCE);
        hamburger2.finalizeOrder();
        Hamburger healthyHamburger = new HealthyBurger(BEEF);
        healthyHamburger.add(LETTUCE);
        healthyHamburger.finalizeOrder();
        healthyHamburger.add(CARROTS);
        healthyHamburger.finalizeOrder();
        Hamburger delux = new DeluxBurger(BEEF, BROWN, 6, 2); // Chips and Drinks added automatically
        delux.add(TOMATOE);// not allowed
        delux.finalizeOrder();
    }

}
