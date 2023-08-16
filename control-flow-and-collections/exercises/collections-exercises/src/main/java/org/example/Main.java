package org.example;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        int x;

        for (int i : integerArray) {
            x = i;
            if (x % 2 != 0) {
                System.out.print(x);
            }
        }



        String phrase = " I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));


        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));

    }

}