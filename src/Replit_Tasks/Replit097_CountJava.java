package Replit_Tasks;

import java.util.Scanner;

public class Replit097_CountJava {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        int count = 0;
        while (word.contains("java")){
            word = word.replaceFirst("java","");
            count++;

        }
        System.out.println(count);
    }
}
