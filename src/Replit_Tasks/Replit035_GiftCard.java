package Replit_Tasks;

import java.util.Scanner;

public class Replit035_GiftCard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int price = 0;
        String item = "";

        item = sc.nextLine();

        switch (item) {
            case "Smartphone":
                price = 300;
                break;
            case "Laptop":
                price = 400;
                break;
            case "Charger":
                price = 15;
                break;
            case "USB cable":
                price = 10;
                break;
            case "Headphones":
                price = 30;
                break;
            case "Pants":
                price = 50;
                break;
            case "Hat":
                price = 25;
                break;
            case "Socks":
                price = 5;
                break;
            case "Blanket":
                price = 60;
                break;
            case "Pillow":
                price = 40;
                break;
            default:
                item = "Invalid item!";
        }
        if (item == "Invalid item!") {
            System.out.println(item);
        } else if (price > 100) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else {
            price = 100 - price;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + price + "$");
        }
    }
}
