package Replit_Tasks;

import java.util.Scanner;

public class Replit120_Arrays_Finding_Max_Length_In_String_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }
        //write your code below
        String longestWord = words[0];
        for(String each : words) {
            if(each.length() > longestWord.length()) {
                longestWord = each;
            }
        }
        System.out.println(longestWord);
    }
}

/*

Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */