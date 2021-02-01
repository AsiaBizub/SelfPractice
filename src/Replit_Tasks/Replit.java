package Replit_Tasks;

import java.util.Scanner;

public class Replit {
        public static void main(String[] args) {
            //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
            // Variables are already declared and given
            Scanner input = new Scanner(System.in);

            System.out.println("Enter age:");
            int age = input.nextInt();
            String result;
            //WRITE YOUR CODE HERE
             result = (age < 2) ? "ineligible" : (age == 2) ? "toddler" : (age >= 3 && age <= 5) ? "early childhood" :
                    (age >= 6 && age <= 7) ? "young reader" : (age >= 8 && age <= 10) ? "elementary" : (age == 11 || age == 12) ? "middle" :
                            (age == 13) ? "impossible" : (age >= 14 && age <= 16) ? "high school" : (age >= 17 && age <= 18) ? "scholar" : "ineligible";
            System.out.println(result);


        }

    }


