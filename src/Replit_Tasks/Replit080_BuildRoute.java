package Replit_Tasks;

import java.util.Scanner;

public class Replit080_BuildRoute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        switch (start){
            case "A":
                if(end.equals("A")){
                    System.out.println("A found");
                }else if(end.equals("B")){
                    System.out.println("right: B found");
                }else if(end.equals("C")){
                    System.out.println("right > down : C found");
                }else if(end.equals("D")){
                    System.out.println("right > down > left :D found");
                }
                break;

            case "B":
                if(end.equals("B")){
                    System.out.println("B found");
                }else if(end.equals("C")){
                    System.out.println("down : C found");
                }else if(end.equals("D")){
                    System.out.println("down > left : D found");
                }else if(end.equals("A")){
                    System.out.println("down > left > up: A found");
                }
                break;

            case "C":
                if(end.equals("C")){
                    System.out.println("C found");
                }else if(end.equals("D")){
                    System.out.println("left : D found");
                }else if(end.equals("A")){
                    System.out.println("left > up : A found");
                }else if(end.equals("B")){
                    System.out.println("left > up > right: B found");
                }
                break;

            case "D":
                if(end.equals("D")){
                    System.out.println("D found");
                }else if(end.equals("A")){
                    System.out.println("up : A found");
                }else if(end.equals("B")){
                    System.out.println("up > right : B found");
                }else if(end.equals("C")){
                    System.out.println("up > right > down : C found");
                }
                break;

        }


    }
}
