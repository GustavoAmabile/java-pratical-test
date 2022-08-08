package com.test.pratical.java.program02;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: "); // request user input
        String string = scan.nextLine();
        System.out.println("Original String: " + string); // print input string
//

        Pattern.compile("[a-zA-z]") // pattern searched
                .matcher(string).results() // search for the pattern
                .map(m -> m.group().toLowerCase()) // convert the string matches to lower case
                .collect(Collectors //create an object of the map and count the elements
                        .groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()))
                .forEach((c, i) -> System.out.println(c + ": " + i)); // iterate over the map

    }
}
