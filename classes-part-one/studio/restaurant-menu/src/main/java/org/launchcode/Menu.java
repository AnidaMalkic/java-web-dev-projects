package main.java.org.launchcode;

import main.java.org.launchcode.MenuItem;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void AddMenuItem(MenuItem item) {
        this.items.add(item);
    }

    public void RemoveItem(MenuItem item) {
        this.items.remove(item);
    }

    public String toString() {
        System.out.println(this.items);
    }
}
