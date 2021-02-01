package Replit_Tasks;

import java.util.Scanner;

public class Replit037_VideoGameCoupons {

        public static void main(String[] args) {
            //Write your code here

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter number of coupons:");
            int numberOfCoupons = scan.nextInt();

            int candy = numberOfCoupons/10;
            int gumball = (numberOfCoupons%10)/3;

            if(numberOfCoupons>=3){
                System.out.println("Number of Candies: " + candy);
                System.out.println("Number of Gumballs: " + gumball);
            }else{
                System.out.println("Not enough coupons");
            }


        }
    }

