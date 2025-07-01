// Class String and its methods

package com.strings;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating String object
        String str = new String("I am String");

        // Finding out the index of string "am"
        int number = str.indexOf("am");
        System.out.println(number);

        // Method indexOf("str", 3) will find strings starting from index 3
        int number2 = str.indexOf("tr", 3);
        System.out.println(number2);

        // Creating new String
        String str1 = new String("I am String");

        // Checking if str and str1 are equal
        System.out.println(str == str1); // false

        // Creating new string with the same value as first one and give it also value "I am String"
        String str2 = str;

        // Checking if str and str2 equal
        System.out.println(str == str); // true

        // Creating new string with value "I am not String"
        String str3 = new String("I am not String");

        // Checking if str and str3 equal
        System.out.println(str == str3); // false

        // Giving str2 value as str3 and comparing them
        str2 = "I am not String";

        // Checking if str2 and str3 equal
        System.out.println(str == str3); // false
    }
}