package Practice_Tasks;

import java.util.Scanner;

public class PrintAsterisk {
    public static void main(String[] args) {
        int j = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for( int i = 0; j< n; j++){
            System.out.println("*");
        }

    }
}
