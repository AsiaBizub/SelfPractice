package Replit_Tasks;

import java.util.Scanner;

public class Replit132_Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE

        float max = score[0];
        float min = score[0];
        float sum = 0;
        float total = 0;

        for(int i = 0; i < score.length; i++) {
                                                           // index number 0-- judges
            System.out.println("Enter score for judge "+(i+1)+":"); // ask scanner to enter
            score[i] = input.nextFloat(); // fill out the value of array after you asked scanner a question ^

            if(score[i]>max){
                max = score[i];
            }
            if(score[i]<min) {
                min = score[i];
            }

            sum += score[i];

        }

        sum = sum - min - max;


        System.out.println("Enter difficulty:");
         float difficulty = input.nextFloat();

        total = sum * difficulty * 0.6f;

        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);
    }
}



/*
In the sport of diving, seven judges award a score between 0 and 10, where each score may be
a floating-point value. The highest and lowest scores are thrown out, and the remaining scores
are added together. The sum is then multiplied by the degree of difficulty for that dive.
The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6
to determine the divers score.
NOTE: Use System.out.printf("Total: %.2f",total); in order to get rid of extra floating points.

output: Enter score for judge 1:
input: 1
output: Enter score for judge 2:
input: 5
output: Enter score for judge 3:
input: 5
output: Enter score for judge 4:
input: 5
output: Enter score for judge 5:
input: 5
output: Enter score for judge 6:
input: 8
output: Enter score for judge 7:
input: 9
output: Enter difficulty:
input: 2.1
output: Total: 35.28
 */
