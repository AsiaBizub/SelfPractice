package Replit_Tasks;

import java.util.Scanner;

public class Replit051_TipCalculator {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                System.out.println("Do you want to split: Yes?");
                String split = scan.next();
                System.out.println("Enter number of people:");
                int numberOfPeople = scan.nextInt();
                System.out.println("Enter your service Quality word");
                String serviceQuality = scan.next();
                System.out.println("How much?");
                double checkAmount = scan.nextDouble();
                double totalToPay = 0;

                double totalTip = 0;
                double totalPerPerson = 0;
                double tipPerPerson = 0;

                switch (serviceQuality) {
                    case "Poor":
                        totalTip = checkAmount / 20;
                        break;
                    case "Fair":
                        totalTip = checkAmount / 10;
                        break;
                    case "Good":
                        totalTip = checkAmount * (3.0 / 20);
                        break;
                    case "Great":
                        totalTip = checkAmount / 5;
                        break;
                    case "Excellent":
                        totalTip = checkAmount / 4;
                        break;
                    default:
                        totalTip = 0;
                }

                totalToPay = (double)(checkAmount + totalTip);


                if(split.equalsIgnoreCase("yes")){
                    totalPerPerson=(double)totalToPay/numberOfPeople;
                    tipPerPerson=(double)totalTip/numberOfPeople;
                }else{
                    totalPerPerson=0;
                    tipPerPerson=0;
                }

                String numPeople="";

                System.out.print("Number of people entered: ");
                for (int i=1;i<=numberOfPeople;i++)
                {System.out.print("&");
                };
                System.out.println();
                System.out.println("Total to pay: "+totalToPay);
                System.out.println("Total tip: "+totalTip);
                System.out.println("Total per person: "+(double)totalPerPerson);
                System.out.println("Tip per person: "+(double)tipPerPerson);

            }
    }

