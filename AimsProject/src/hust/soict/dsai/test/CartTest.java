package hust.soict.dsai.test;

import hust.soict.dsai.aims.Cart;
import hust.soict.dsai.aims.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        //Test print method
        cart.displayCart();

        //Test search methods
        cart.searchById(0);
        cart.searchById(1);
        cart.searchById(2);
        cart.searchById(3);
        cart.searchByTitle(null);
        cart.searchByTitle("The Lion King");
        cart.searchByTitle("Star Wars");
        cart.searchByTitle("Aladin");
        cart.searchByTitle("The Lion King 2");
    }
}