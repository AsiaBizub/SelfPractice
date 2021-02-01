package Replit_Tasks;

import java.util.Scanner;

public class Replit048_ThreeNums {
    public static void main(String[] args) {
    // Variables are already declared and given
    Scanner s = new Scanner(System.in);

    int n1 = s.nextInt();
    int n2 = s.nextInt();
    int n3 = s.nextInt();

    //your code here

    String result = "";
    String str = " is bigger";

    if(n1>n2 &&n1>n3)

    {
        result = "n1" + str;
    }else if(n2>n1 &&n2>n3)

    {
        result = "n2" + str;
    }else

    {
        result = "n3" + str;
    }
    System.out.println(result);


}
}
