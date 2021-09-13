/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Mousa
 */


import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the input string?");
        String str = input.nextLine();
        System.out.println(str + " has " + str.length() + " characters");
    }
}
