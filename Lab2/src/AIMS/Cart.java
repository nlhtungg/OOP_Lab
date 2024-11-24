package AIMS;

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

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for(int i = 0; i < dvdList.length; i++) {
            if(qtyOrdered == MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is almost full!");
                return;
            }
            itemsOrdered[qtyOrdered] = dvdList[i];
            qtyOrdered += 1;
            System.out.println("The disc " + dvdList[i].getTitle() + " has been added!");
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
}