package Replit_Tasks;

import java.util.Scanner;

public class Replit096_RepeatSeparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String str ="";

        for(int i=1; i <= count; i++){
            str += separator;
            str += word;
        }

        str = str.replaceFirst(separator, "");
        System.out.println(str);


    }
}