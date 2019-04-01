package com.company;

import java.util.Scanner;

public class StringExamples {
//this will be a helpful tool for learning Strings

    /*
    Add any other helpful information here.

    word.charAt(enter a number here); returns char at number
    word.concat("enter a word"); adds a word to the end
    word.equals("enter a word"); compares two Strings
    word.toUpperCase(); makes a word all CAPS
    word.toLowerCase(); makes the word LOWERcase

     */
    //sout enter creates sysout

    public static void main(String[] args) {
        System.out.println("Enter A 5 letter Word Please Or Die");
        String example = new Scanner(System.in).next();
        System.out.println(example.charAt(example.length()/2));
        System.out.println(example.equals("hello world"));
        System.out.println(example.concat(example));
        System.out.println(example.toUpperCase());
        System.out.println(example.toLowerCase());
    }
}
