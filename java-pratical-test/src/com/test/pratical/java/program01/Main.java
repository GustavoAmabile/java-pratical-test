package com.test.pratical.java.program01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: "); // request user input
        String str = scan.nextLine();

        System.out.println("Original string: " + str); // print original input string

        str = str.toLowerCase(); // set all characters to lower cas
        str = str.replaceAll(" ", ""); // replace all blank spaces for empties values
        str = str.replaceAll("\\d", ""); // replace all numbers for empties values

        CharCount counter = new CharCount(); // create a CharCount object
        counter.charCount(str); // calls the method to count the user input string characters

    }
}
