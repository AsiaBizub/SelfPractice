package Replit_Tasks;

import java.util.Scanner;

public class Replit088_CatsAndDogs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        for(int i = 0; i<word.length(); i++){
            if(word.contains("cat")){
                word=word.replaceFirst("cat","");
                countOfCats++;
            }
            if(word.contains("dog")){
                word=word.replaceFirst("dog","");
                countOfDogs++;
            }
        }
        System.out.println(countOfCats==countOfDogs);

    }
}