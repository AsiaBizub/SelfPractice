package Replit_Tasks;

import java.util.Scanner;

public class Replit119_Arrays_Split_Email {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
        String[] splitEmail = email.split("@");
        if (splitEmail.length == 2) {
            System.out.println("Email id: " + splitEmail[0]);
            System.out.println("Email domain: " + splitEmail[1]);
        } else {
            System.out.println("invalid email");
        }
    }
}
