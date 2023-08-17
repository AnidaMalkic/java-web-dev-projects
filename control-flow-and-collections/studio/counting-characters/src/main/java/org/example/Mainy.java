package org.example;

import java.util.HashMap;
import java.util.Map;

public class Mainy {
    public static void main(String[] args) {

        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = myString.toCharArray();

        HashMap<Character, Integer> characterCountingMap = new HashMap<>();

        for ( Character character : charactersInString) {

            System.out.println(character);




      if (characterCountingMap.containsKey(character)) {

          characterCountingMap.put(character,characterCountingMap.get(character) + 1);

        } else {
          characterCountingMap.put(character,1);
      }
            System.out.println(characterCountingMap);
        }
    }
}