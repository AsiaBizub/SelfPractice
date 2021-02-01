package Replit_Tasks;

import java.util.Scanner;

public class Replit_For_Loop_1 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        for(int i = 0; i < word.length(); i++){
            System.out.print(word.charAt(i));
        }


    }
}
