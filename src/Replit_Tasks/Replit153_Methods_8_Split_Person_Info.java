package Replit_Tasks;

import java.util.Scanner;

public class Replit153_Methods_8_Split_Person_Info {

    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        String s = inp.next();
        person(s);
    }
    public static void person (String info){

        String [] word = info.split(",");

        System.out.println("person's name: "+word[0]+" last name: "+word[1]+" age: "+word[2]);
        // your code here
    }// end person
}
/*
Instructions from your teacher:

The method person get a string with this format : "name,last name,age"
for example:
person("jon,doe,30");
the output is:
person name: jon last name: doe age: 30
hint: use the split method to split the string to a string array where there is a "," char
*/