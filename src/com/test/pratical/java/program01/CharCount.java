package com.test.pratical.java.program01;

import java.util.HashMap;
import java.util.Map;
public class CharCount {
    public CharCount() {
    }
    public void charCount(String string) {

        // create a HashMap to store String Keys and Integer values
        HashMap<Character, Integer> chars = new HashMap<>();

        // input text processing
        for (char c:
             string.toCharArray()) { // converts a string to a new character array
            if(chars.containsKey(c)){ // if the char is in the map
                chars.put(c, chars.get(c) + 1); // increment count
            } else {
                chars.put(c, 1); // add new character to the map
            }
        }

        // print the result to the console
        for (Map.Entry entry:
             chars.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
