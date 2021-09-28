/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Josh Boada
 */

import java.util.Scanner;
import java.util.Objects;

public class app {
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Provide an Username ");
        String username = input.nextLine();

        System.out.print("Provide a Password ");
        String password= input.nextLine();

        System.out.print("\n\n\n");
        System.out.print("What is your password? ");
        String pass= input.nextLine();

        if (Objects.equals(pass, password)) {
            System.out.println("Welcome");
        }
        else {
            System.out.println("I do not know you");
        }


    }
}
