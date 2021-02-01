package Replit_Tasks;

import java.util.Scanner;

public class Replit083_FirstTwoCharacters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here

        System.out.print(txt.substring(0,2));
    }
}
