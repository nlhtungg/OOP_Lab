package hust.soict.dsai.aims;

import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore;

    public Store() {
        this.itemsInStore = new ArrayList<>();
    }

    public void addDVD(DigitalVideoDisc dvd) {
        this.itemsInStore.add(dvd);
        System.out.println("The disc " + dvd.getTitle() + " has been added!");
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        if(itemsInStore.remove(dvd)) {
            System.out.println("The disc " + dvd.getTitle() + " has been removed!");
        } else {
            System.out.println("Could not find " + dvd.getTitle() + " in store!");
        }
    }
}
