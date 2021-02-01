package Replit_Tasks;

import java.util.Scanner;

public class Replit109_Arrays_Printing_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 5 items

        //write your code below:
        for(int i = 0; i < arr.length; i++) {
            String first3Chars = arr[i].substring(0,3);
            System.out.println(first3Chars);
        }

    }
}