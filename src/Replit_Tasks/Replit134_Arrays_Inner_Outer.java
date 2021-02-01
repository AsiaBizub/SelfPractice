package Replit_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Replit134_Arrays_Inner_Outer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();

        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];

        for(int i =0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }

        for(int j =0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);
        //WRITE YOUR CODE HERE

        int [] temp = new int [sizeInner];

        for ( int i = 0; i < outer.length; i++){

            for ( int j = 0; j <inner.length; j++){

                if(outer[i] == inner [j]){
                    temp[j] = outer [i];
                }
            }
        }
        System.out.println(Arrays.equals(inner, temp));




    }
}
