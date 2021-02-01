package Replit_Tasks;

import java.util.Scanner;

public class Replit098_CountHi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int count = 0;

        while(str.contains("hi")) {
            count++;
            str = str.replaceFirst("hi", "");
        }

        System.out.println(count);
    }
}
