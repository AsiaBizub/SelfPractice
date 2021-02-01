package Replit_Tasks;

import java.util.Scanner;

public class Replit101_EqualsJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String sentence = scan.nextLine();

        int countOfJava = 0;
        int countOfPython = 0;

        while(sentence.contains("java") || sentence.contains("python")) {

            if(sentence.contains("java")) {
                countOfJava++;
                sentence = sentence.replaceFirst("java", "");
            }

            if(sentence.contains("python")) {
                countOfPython++;
                sentence = sentence.replaceFirst("python", "");
            }

        }

        System.out.println(countOfJava == countOfPython);

    }
}
