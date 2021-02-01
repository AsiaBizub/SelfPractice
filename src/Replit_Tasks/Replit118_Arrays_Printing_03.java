package Replit_Tasks;

import java.util.Scanner;

public class Replit118_Arrays_Printing_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 6 items
        //and print three neibouring items at a time till last item
        //write your code below

        for(int i = 0; i < arr.length; i++) {
            if(i <= arr.length-3) {
                for (int j = i; j <= i + 2; j++) {
                    if(j < i + 2) {
                        System.out.print(arr[j] + " , ");
                    }else {
                        System.out.print(arr[j]);
                    }
                }
                System.out.println();
            }
        }
    }
}