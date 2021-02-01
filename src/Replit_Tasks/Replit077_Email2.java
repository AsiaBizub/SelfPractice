package Replit_Tasks;

import java.util.Scanner;

public class Replit077_Email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        System.out.println("First name: " + email.substring(0, 1).toUpperCase()+email.substring(1, email.indexOf("_")).toLowerCase());
        System.out.println("Last name: " + email.substring(email.indexOf("_")+1, email.indexOf("_")+2).toUpperCase()+email.substring(email.indexOf("_")+2,email.lastIndexOf("@")).toLowerCase());
        System.out.println("Domain: " + email.substring(email.indexOf("@")+1, email.indexOf(".")));
        System.out.println("Top-Level Domain: " + email.substring(email.indexOf(".")+1));



    }
}
