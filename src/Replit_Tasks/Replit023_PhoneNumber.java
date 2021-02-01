package Replit_Tasks;

import java.util.Scanner;

public class Replit023_PhoneNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter area code");
        int areaCode = scan.nextInt();
        System.out.println("Enter local number");
        int localNumber = scan.nextInt();

        String phoneNumber = ("("+areaCode+")" + "-" +localNumber);

        System.out.println("Calling number "+phoneNumber);
    }
}
