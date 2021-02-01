package Practice_Tasks;

import java.util.Scanner;

public class UserFound {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter full name:");
        String fullName = scan.nextLine();

        boolean userFound = fullName.equalsIgnoreCase("Max Payne") || fullName.equalsIgnoreCase("Alan Wake");
        if(userFound){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }
    }
}









