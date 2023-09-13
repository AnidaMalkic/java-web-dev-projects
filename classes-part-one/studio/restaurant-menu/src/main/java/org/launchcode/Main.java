package org.launchcode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Menu menu = new Menu()

        MenuItem soup = new MenuItem(2.0, "Mashroom soup", "appetizer", True);
        MenuItem steak = new MenuItem(16.0, "Beef steak", "main course", True);


        menu.AddMenuItem(soup);
        menu.toString();


    }
}
