package Replit_Tasks;

import java.util.Scanner;

public class Replit044_HappyValleySchoolSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter age:");
        int age = input.nextInt();

        String result;

        if( age <2){
            result = "ineligible";
        }else if(age == 2){
            result = "toddler";
        }else if(age < 5){
            result = "early childhood";
        }else if(age < 7){
            result = "young reader";
        }else if(age <10){
            result = "elementary";
        }else if(age==13){
            result = "impossible";
        }else if( age < 16){
            result = "high school";
        }else if(age < 18){
            result = "scholar";
        }else{
            result = "ineligible";
        }
        System.out.println(result);
    }



}
