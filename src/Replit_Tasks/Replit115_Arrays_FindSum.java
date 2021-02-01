package Replit_Tasks;

import java.util.Scanner;

public class Replit115_Arrays_FindSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        // yes above code will ask user 5 numbers while creating an array
        // just assume that you have int array with 5 numbers and start working on requirement
        // loop through the array and get the sum of the numbers

        //TODO: Write your code below

        int sumOfNums = 0;
        for(int i = 0; i<nums.length; i++){
            sumOfNums += nums[i];
        }
        System.out.println(sumOfNums);

    }
}

/*
Given an array num, calculate the sum of all numbers in nums and print out to console.

nums → [2, 1, 2, 3, 4]) → 12
nums → [2, 2, 0, 3, 5]) → 12
nums → [1, 3, 5, 7, 9]) → 25
 */

