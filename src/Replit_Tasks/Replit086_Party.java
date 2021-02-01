package Replit_Tasks;

import java.util.Scanner;

public class Replit086_Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // your code
        // ------------------------------------------
        System.out.println("Please enter guest name:");String guest = input.next();

        System.out.println("Do you want to enter new guest name:");
        String newGuest = input.next();

        while(newGuest.equalsIgnoreCase("yes")){
            System.out.println("Please enter guest name:");
            guest=guest+", "+input.next();
            System.out.println("Do you want to enter new guest name:");
            newGuest=input.next();
        }

        System.out.println("Guest's list: "+guest);
    }
}
