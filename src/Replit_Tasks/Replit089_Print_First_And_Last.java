package Replit_Tasks;

import java.util.Scanner;

public class Replit089_Print_First_And_Last {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String word = scan.next();

        String firstLetter = word.substring(0,1);
        String lastLetter = word.substring(word.length()-1);

        System.out.println(firstLetter+lastLetter);

        System.out.println("============================");

        System.out.println("" + word.charAt(0) + word.substring(word.length()-1));

    }
}

