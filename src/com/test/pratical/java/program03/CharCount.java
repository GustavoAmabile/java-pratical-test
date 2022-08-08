package com.test.pratical.java.program03;

import com.sun.source.tree.Tree;

import java.nio.file.LinkPermission;
import java.util.*;

public class CharCount {

    public static void main(String[] args) {
        Map<Character, Integer> characterMap = new HashMap<>();
        createMap(characterMap);
        displayMap(characterMap);
    }

    private static void createMap(Map<Character, Integer> map){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: "); //request user input
        String str = scanner.nextLine();
        System.out.print("Original String: " + str); // output the user string
        str = str.toLowerCase(); // set all characters to lower case
        str = str.replaceAll(" ", ""); // replace all blank spaces for empties values
        str = str.replaceAll("\\d", ""); // replace all numbers for empties values

        for (char chars: str.toCharArray()){ // process input string
            Character c = chars;
            if (map.containsKey(c)) { // if the map contains the character
                int count = map.get(c); // get count
                map.put(c, count + 1); // increment count
            }
            else {
                map.put(c, 1); // add new character to the map
            }
        }
    }

    private static void displayMap(Map<Character, Integer> map)
    {
        Set<Character> keys = map.keySet(); // get the characters

        TreeSet<Character> sortedKeys = new TreeSet<>(keys); // sort the characters

        System.out.printf("%nCharacters\t\tOcurrences%n");

        for(Character key : sortedKeys){ // print the count of each character
            System.out.printf("%-10s%7s%n", key, map.get(key));
        }

    }

}
