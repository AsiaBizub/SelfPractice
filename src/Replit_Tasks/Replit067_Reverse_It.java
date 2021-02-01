package Replit_Tasks;

import java.util.Scanner;

public class Replit067_Reverse_It {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        String word = scan.next();
        scan.close();

        String result = "";

        if(word.length()==5) {
            for (int l = word.length() - 1; l >= 0; l--) {
                result += word.charAt(l);
            }
            System.out.println(result);
        }else if(word.length()<5) {
            System.out.println("Too short!");
        }else{
            System.out.println("Too long!");
        }
    }
}
