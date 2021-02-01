package Replit_Tasks;

import java.util.Scanner;

public class Replit090_TipCalculator_2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Split:");
        String Split=input.next();

        System.out.println("Number of people:");
        int numberOfPeople=input.nextInt();

        String numberOfPeopleAdding="";
        for(int i=1;i<=numberOfPeople;i++){
        numberOfPeopleAdding+="&";
        }

        System.out.println("Check amount:");
        double checkAmount=input.nextDouble();

        System.out.println("Service Quality:");
        String serviceQua=input.next();
        double result=0;
        switch(serviceQua){
            case "Poor":
                result=checkAmount*.05;
                break;
            case "Fair":
                result=checkAmount*.10;
                break;
            case "Good":
                result=checkAmount*.15;
                break;
            case "Great":
                result=checkAmount*.20;
                break;
            case "Excellent":
                result=checkAmount*.25;
                break;
        }

        System.out.println("Number of people entered: "+numberOfPeopleAdding);
        System.out.println("Total to pay: "+(checkAmount+result));
        System.out.println("Total tip: "+result);
        System.out.println("Total per person: "+(checkAmount+result)/numberOfPeople);
        System.out.println("Tip per person: "+result/numberOfPeople);

        }
}
