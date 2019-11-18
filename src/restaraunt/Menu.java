package restaraunt;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    ArrayList<MenuItem> appetizers = new ArrayList<>();
    ArrayList<MenuItem> mains = new ArrayList<>();
    ArrayList<MenuItem> desserts = new ArrayList<>();
    ArrayList<MenuItem> newItems = new ArrayList<>();
    public Date lastUpdated = new Date();

    public void addToListArray(MenuItem input) {
        if (input.newItem.equals(true)) {
            newItems.add(input);
        }
        if (input.category.equals("dessert")) {
            desserts.add(input);
        } else if (input.category.equals("mains")) {
            mains.add(input);
        } else if (input.category.equals("appetizer")) {
            appetizers.add(input);
        }
    }

//    public void printMenu(ArrayList list) {
//        for (listItem : list) {
//            System.out.println();
//        }
//    }

    public ArrayList<MenuItem> getAppetizers() {
        return appetizers;
    }

    public void setAppetizers(ArrayList<MenuItem> appetizers) {
        this.appetizers = appetizers;
    }

    public ArrayList<MenuItem> getMains() {
        return mains;
    }

    public void setMains(ArrayList<MenuItem> mains) {
        this.mains = mains;
    }

    public ArrayList<MenuItem> getDesserts() {
        return desserts;
    }

    public void setDesserts(ArrayList<MenuItem> desserts) {
        this.desserts = desserts;
    }

    public ArrayList<MenuItem> getNewItems() {
        return newItems;
    }

    public void setNewItems(ArrayList<MenuItem> newItems) {
        this.newItems = newItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

//    @Override
//    public String toString() {
//        return "Our Menu" + "\n" +
//                "Appetizers: " + appetizers +
//                ", Mains: " + mains +
//                ", Desserts: " + desserts +
//                ", New Items: " + newItems +
//                ", Last Updated on " + lastUpdated;
//    }
}
