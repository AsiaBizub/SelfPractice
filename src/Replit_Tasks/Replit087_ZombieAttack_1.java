package Replit_Tasks;

import java.util.Scanner;

public class Replit087_ZombieAttack_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day =0;

        while (true) {
            if (inhabitants != 0) {
                System.out.println("Day " + "[" + inhabitants + "]");
                inhabitants /= 2;
                day++;
            } else {
                System.out.println("----EXTINCT----");
                break;
            }
        }
    }
}
