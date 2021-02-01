package Replit_Tasks;

import java.util.Scanner;

public class Replit073_MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.length()%2!=0 && word.length()>=5){
            System.out.println(word.substring(word.length()/2-1,word.length()/2+2));
        }else{
            System.out.println("invalid");
        }

    }
}
