package Replit_Tasks;

import java.util.Scanner;

public class Replit020_Time {
    public static void main(String[] args) {
        //1. WRITE YOUR CODE HERE:

        int hour= 0;
        int minute= 0;
        int second= 0;
        String amOrPm= " ";


        //DO NOT TOUCH BELOW LINES. TEACHER WILL SET VALUES
        Scanner sc = new Scanner(System.in);
        hour   = sc.nextInt();
        minute = sc.nextInt();
        second = sc.nextInt();
        amOrPm = sc.next();
        //#############################

        //2. WRITE YOUR CODE HERE:

        System.out.println(hour + ":" + minute + ":" + second + " "
                + amOrPm);







    }
}