package Replit_Tasks;

import java.util.Scanner;

public class Replit154_Methods_9_isPos {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];

        for(int i=0 ;i<=size-1;i++)
        {
            arr[i]=inp.nextInt();
        }
        //#2 Your code here
        for(int j : arr){
            isPos(j);
        }
    }

    public static void isPos(int num)
    {
        //#1 your code here
        String result = (num > 0)? "positive" : "not positive";
        System.out.println(result);
    }
}

/*
Instructions from your teacher:
isPos is a method that checks if  an int positive or not positive
1. If  the int num is positive print positive else print not positive
2. Complete main method by calling isPos method for each element in the array arr.
 */
