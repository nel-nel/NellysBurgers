
package nellysburgers;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import nellysburgers.Bread;
import nellysburgers.Hamburger;
import javax.swing.text.html.HTMLDocument;

public class NellysBurgers {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger(Meat.PORK,Bread.WHITE);
        hamburger.add(Addition.TOMATOE);
        hamburger.add(Addition.TOMATOE);
        hamburger.add(Addition.TOMATOE);
        hamburger.add(Addition.LETTUCE);
        hamburger.add(Addition.LETTUCE);
    }
    
}
