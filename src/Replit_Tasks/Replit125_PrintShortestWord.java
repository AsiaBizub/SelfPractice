package Replit_Tasks;

import java.util.Scanner;

public class Replit125_PrintShortestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next()};
        String shortest = str[0];

        for ( String each : str) {
            if(shortest.length() > each.length()){
                shortest = each;

            }
        }

        System.out.println(shortest);



    }
}

/*
Write a program that will print the shortest word in the given array str.

input: java, cable, red, vivid, remedy, grace
output: red
 */