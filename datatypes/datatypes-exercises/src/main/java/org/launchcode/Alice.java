package org.launchcode;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        String text = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "‘and what is the use of a book,’ thought Alice " +
                "‘without pictures or conversation?";

        System.out.println("Which word are you looking for?");
        Scanner input = new Scanner(System.in);
        String searchWord = input.nextLine();
        System.out.println(text.toLowerCase().contains(searchWord));
    }
}
