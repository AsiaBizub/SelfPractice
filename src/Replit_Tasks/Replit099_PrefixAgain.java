package Replit_Tasks;

import java.util.Scanner;

public class Replit099_PrefixAgain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        String temp = str.substring(0, n);

        int count = 0;

        while(str.contains(temp)) {

            count++;
            str = str.replaceFirst(str.substring(0, n), "");

        }

        System.out.println(count > 1);

    }
}
