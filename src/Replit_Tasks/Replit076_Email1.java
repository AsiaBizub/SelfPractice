package Replit_Tasks;

import java.util.Scanner;

public class Replit076_Email1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String email = scan.next();

        //mike_tyson@gmail.com --> tyson_mike@gmail.com, otherwise no change

        if(email.contains("_")){
            String firstName = email.substring(0, email.indexOf("_"));
            String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"));

            email = lastName+"_"+firstName+domain;

        }else{
            System.out.println(email);
        }
        System.out.println(email);
    }
}
