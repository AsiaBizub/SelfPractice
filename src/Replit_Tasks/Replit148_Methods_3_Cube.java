package Replit_Tasks;

import java.util.Scanner;

public class Replit148_Methods_3_Cube {
    public static void cube(){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int cubeValue = num*num*num;
        System.out.println(cubeValue);
    }

    //end cube

    public static void main(String[] args) {

        cube();

    }
}