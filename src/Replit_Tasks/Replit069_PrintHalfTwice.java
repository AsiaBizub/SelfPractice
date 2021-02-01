package Replit_Tasks;

import java.util.Scanner;

public class Replit069_PrintHalfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String word = scan.next();
        scan.close();

        String result="";

        if(word.length()>=2){
                result = (word.substring(0, word.length()/2));
            }
        System.out.println(result+result);

        }
    }
