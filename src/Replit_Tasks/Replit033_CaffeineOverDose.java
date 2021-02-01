package Replit_Tasks;

import java.util.Scanner;

public class Replit033_CaffeineOverDose {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        int numOfMilligrams = scan.nextInt();

        int overDose = 10*1000/numOfMilligrams;

        System.out.println("Enter number of milligrams in drink:");
        System.out.println("It would take about " + overDose + " drinks for a lethal overdose.");


    }
}
