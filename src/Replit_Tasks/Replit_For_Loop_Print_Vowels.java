package Replit_Tasks;

import java.util.Scanner;

public class Replit_For_Loop_Print_Vowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        int i = 0;


        for(i = 0; i<=word.length()-1; i++) {
            char c = word.charAt(i);
            if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
                System.out.print(c + "");
            }

        }

    }
}
/*
for (int i=0; i<len; i++) {
    char c = sh.charAt(i);
    if ((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')) {
        sb.append(ch.charAt(r.nextInt(ch.length())));
 */