package Replit_Tasks;

import java.util.Scanner;

public class Replit_Practice_BlackJack_IfStatement {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int house = s.nextInt();
        int player = s.nextInt();

        //your code here

        if(house+player>21){
            System.out.println("bust");
        }else if(house>player){
            System.out.println("player loss");
        }else if(house==player){
            System.out.println("its a tie");
        }else{
            System.out.println("player wins");
        }
    }
}




        /*
        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String a = s.nextLine();

        //your code here


        switch(a){
            case "a":
                System.out.println("a is wrong");
                break;
            case "b":
                System.out.println("b is correct");
                break;
            case "c":
                System.out.println("c is wrong");
                break;
            default:
                System.out.println("j is not a valid answer");
                break;
                */



