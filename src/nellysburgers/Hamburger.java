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

    public Meat meat;
    private Bread bread;
    private double basePrice;
    private int maxAdditions;
    private double finalPrice;
    private StringBuilder receipt;
    private int countAdditions;

    public Hamburger(Meat meat, Bread bread, int basePrice, int maxAdditions) {
        // type of meat and bread 
        this.meat = meat;
        this.bread = bread;
        this.basePrice = basePrice;
        this.maxAdditions = maxAdditions;
        this.finalPrice = basePrice;
        receipt = new StringBuilder("Receipt:\n");
        countAdditions = 0;
        recalculatePrice(meat); // the price is different for different types of meats
        receipt.append(this.getClass().getSimpleName()).append("(").append(meat.toString())
                .append(")").append(":").append(finalPrice).append(";\n");
        System.out.printf("\n\nORDERING a %s with %s for %.2f$.", this.getClass().getSimpleName(), meat.toString(), finalPrice);
    }

    private void recalculatePrice(Extras extra) {
        //keeps the finalPrice updated 
        this.finalPrice += extra.getCost();
    }

    //add additional items, call recalculate(), check for the maximum of additions, save in receipt
    public void add(Addition addition) {
        if (countAdditions >= maxAdditions) {
            System.out.printf("\nYou can't add more than %d for this Burger!", maxAdditions);
        } else {
            countAdditions++;
            recalculatePrice(addition);
            System.out.printf("\nadding %s for an extra:%.2f$", addition.toString(), addition.getCost());
            receipt.append(addition.toString()).append(":")
                    .append(addition.getCost()).append("\n");
        }
    }

    public double finalizeOrder() {
        String finalPriceString = String.format("%.2f$.\n", this.finalPrice);
        receipt.append("              Total:").append(finalPriceString);
        System.out.printf("\nORDER FINALIZED!\n%s", receipt); //print receipt
        return this.finalPrice;
    }
}
