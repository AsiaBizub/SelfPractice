package Replit_Tasks;

import java.util.Scanner;

public class Replit034_VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int itemPrice = scan.nextInt();
        int quarters =(100-itemPrice)/25;
        int dimes = (100-itemPrice)%25/10;
        int nickels =(100-itemPrice)%25%10/5;


        if(itemPrice>=25 && itemPrice<=100 && itemPrice%5==0){
            System.out.println("Enter price in cents:\nYour change is " + quarters
                    + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
        }else{
            System.out.println("Enter price in cents:\nInvalid price!");
        }

    }
}
