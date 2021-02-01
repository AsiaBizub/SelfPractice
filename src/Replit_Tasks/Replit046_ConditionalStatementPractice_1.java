package Replit_Tasks;

import java.util.Scanner;

public class Replit046_ConditionalStatementPractice_1 {

    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        System.out.println("In:");
        int num = inp.nextInt();

     if(num > 0){
         System.out.println(num +" is positive)");
     }else if(num < 0){
         System.out.println(num+" is negative");
     }else{
         System.out.println(" ");
     }

    }
}
