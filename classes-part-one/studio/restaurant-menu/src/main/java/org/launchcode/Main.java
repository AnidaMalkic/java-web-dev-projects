package main.java.org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Date lastUpdated = new Date();
        ArrayList<MenuItem> menuItems = new ArrayList<>();

        Menu menu = new Menu(lastUpdated, menuItems);

        MenuItem soup = new MenuItem(2.0, "Mashroom soup", "appetizer", true);
        MenuItem steak = new MenuItem(16.0, "Beef steak", "main course", true);


        menu.AddMenuItem(soup);
        menu.AddMenuItem(steak);
        menu.toString();


    }
}
