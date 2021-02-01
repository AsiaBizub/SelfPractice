package Replit_Tasks;

import java.util.Scanner;

public class Replit061_TernaryOperator_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter number: ");
        int x = scan.nextInt();

        String result = (x>=5) ? "x" : "-x";
        System.out.println(result);


    }
}
