package Replit_Tasks;

import java.util.Scanner;

public class Replit152_Methods_7_Plus_Minus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {
            arr[i]=inp.nextInt();
        }
        plus_minus(arr);
    }//end of main method
    // write your codes here:

    public static void plus_minus(int [] arr){
        String result ="";
        int positives = 0;
        int negatives =0;
        int zeros = 0;
        for ( int each : arr){
            if( each>0){
                positives++;
            }else if(each<0){
                negatives++;
            }else{
                zeros++;
            }
        }
        result = "positives:"+positives+", "+"negatives:"+negatives+", "+"zeros:"+zeros;
        System.out.println(result);
    }
}

/*
Instructions from your teacher:
Create a method called plus_minus that gets an array of ints (int[]), it outputs how many negative , positive and zero numbers are in the array.
for example:
plus_minus (new int[]{1,2,55,-9,-2,0});
will output:
positives:3, negatives:2, zeros:1
 */