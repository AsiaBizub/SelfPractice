package Replit_Tasks;

import java.util.Scanner;

public class Replit110_Arrays_Print_First_Last_Char {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print firt and last char of each items in one line

        //TODO: Write your code below
        String firstLast ="";

        for(int i=0;i<words.length;i++){
            firstLast = words[i].substring(0,1)+words[i].substring(words[i].length()-1);
            System.out.println(firstLast);
        }


    }
}

/*
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne
 */