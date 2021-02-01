package Replit_Tasks;

import java.util.Scanner;

public class Replit135_Arrays_SplitSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below
        String [] sentenceArr = sentence.split(" ");
        for(String eachWord : sentenceArr){
            System.out.println(eachWord);
        }
    }
}

/*
Given a String variable sentence, write code to type each word in separate lines.

Example:
sentence -> "Java is fun"
Print
Java
is
fun
 */