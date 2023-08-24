package org.launchcode;

import java.util.Scanner;

public class AreaOfrectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the rectangle:");
        Double numLength = input.nextDouble();

        System.out.println("WHat is the width of rectangle: ");
        Double numWidth = input.nextDouble();

        Double aor = numLength * numWidth;
        System.out.println("Area of rectangle is " + aor);
        }

}
