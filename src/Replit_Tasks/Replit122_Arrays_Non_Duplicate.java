package Replit_Tasks;

import java.util.Scanner;

public class Replit122_Arrays_Non_Duplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        for( int each2 : nums ) {

            int frequency = 0; // how many times 1 occurs in the array
            for (int each : nums) {
                if (each == each2) {
                    frequency++;
                }
            }

            if(frequency ==1){
                System.out.print(each2);
            }

        }
    }
}

/*
Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4]
         2
 */
