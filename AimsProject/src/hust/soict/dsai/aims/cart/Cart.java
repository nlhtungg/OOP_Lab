package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered += 1;
        System.out.println("The disc " + disc.getTitle() + " has been added!");

        if(qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full!");
            return;
        }
    }



    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if(qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full!");
            return;
        }
        itemsOrdered[qtyOrdered] = dvd1;
        qtyOrdered += 1;
        System.out.println("The disc " + dvd1.getTitle() + " has been added!");

        if(qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full!");
            return;
        }
        itemsOrdered[qtyOrdered] = dvd2;
        qtyOrdered += 1;
        System.out.println("The disc " + dvd2.getTitle() + " has been added!");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
        for (DigitalVideoDisc dvd : dvds) {
            if (qtyOrdered == MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is almost full!");
                return;
            }
            itemsOrdered[qtyOrdered] = dvd;
            qtyOrdered += 1;
            System.out.println("The disc " + dvd.getTitle() + " has been added!");
        }
    }

    public void  removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int discPosition = -1;
        if(itemsOrdered[0] == null) {
        	System.out.println("Your cart is empty!");
        	return;
        }
        for(int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
            if(itemsOrdered[i].equals(disc)) {
                discPosition = i;
                break;
            }
        }

        if(discPosition == -1) {
            System.out.println("Could not find the searched disc in cart!");
        }

        for(int i = discPosition; i <MAX_NUMBERS_ORDERED; i++) {
            if(i == MAX_NUMBERS_ORDERED -1) {
                itemsOrdered[i] = null;
            }
            else itemsOrdered[i] = itemsOrdered[i+1];
        }
        qtyOrdered -= 1;
        System.out.println("The disc " + disc.getTitle() + " has been remove!");
    }

    public float totalCost() {
        float result = 0f;
        for (int i = 0; i < qtyOrdered; i++) {
			result += itemsOrdered[i].getCost();
		}
        return result;
    }

    public void searchById(int id) {
        id++;
        if(id<=0 || id>qtyOrdered || itemsOrdered[id] == null) {
            System.out.println("No disc found!");
        } else {
            System.out.println("Disc found: " + itemsOrdered[id].getTitle() 
            + " - " + itemsOrdered[id].getCategory() 
            + " - " + itemsOrdered[id].getDirector() 
            + " - " + itemsOrdered[id].getLength() 
            + " - " + itemsOrdered[id].getCost());
        }
    }

    public void searchByTitle(String title) {
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i].getTitle().equals(title)) {
                System.out.println("Disc found: " + itemsOrdered[i].getTitle() 
                + " - " + itemsOrdered[i].getCategory() 
                + " - " + itemsOrdered[i].getDirector() 
                + " - " + itemsOrdered[i].getLength() 
                + " - " + itemsOrdered[i].getCost());
                return;
            }
        }
        System.out.println("No disc found!");
    }

    public void displayCart() {
        System.out.println("***********************CART***********************");
        for(int i = 0; i < qtyOrdered; i++) {
            System.out.println(i+1 + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + " - " + itemsOrdered[i].getCost());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("**************************************************");
    }
}