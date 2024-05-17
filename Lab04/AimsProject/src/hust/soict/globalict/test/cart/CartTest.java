package hust.soict.globalict.test.cart;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class CartTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //Create a new cart
        Cart cart = new Cart();
        //Creaete new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
        "Animation", "Roger ALlers", 87, 19.95f);
        cart.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
        "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addMedia(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
        "Animation", 18.99f);
        cart.addMedia(dvd3);

        //test the print method
        cart.print();
        //to-do: test the search methods here
    }

}
