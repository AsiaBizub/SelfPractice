package Replit_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Replit140_Arrays_PrintFirstLastChar_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        String [] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        String[] firsAndLast = new String[words.length];

        for (int i = 0; i< words.length;i++){
            firsAndLast[i]=words[i].charAt(0)+""+words[i].charAt(words[i].length()-1);
        }
        System.out.println(Arrays.toString(firsAndLast));

    }
}


        /*
        String firstAndLast = "";

        for (int i = 0; i < words.length; i++){
            firstAndLast += ""+ words[i].charAt(0)+words[i].charAt(words.[i].length()-1+" ";
        }

        String [] firstAndLastInArr = firstAndLast.trim().split(" ");

        System.out.println(Arrays.toString(firstAndLastInArr));

 */



