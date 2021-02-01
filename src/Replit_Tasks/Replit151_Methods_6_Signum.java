package Replit_Tasks;

import java.util.Scanner;

public class Replit151_Methods_6_Signum {

        public static void sign(int n)
        {
            //your code here
            n = (n>0)?1:(n<0)?-1:0;
            System.out.println(n);

        }//end sign

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            int n = inp.nextInt();

            sign(n);


        }

}
/*
Instructions from your teacher:
a sign function is simple, its gets a number and tells you if its positive, negative or zero.

for example :
sign(5)  => 1
sign(-30)=> -1
sign(0)  => 0

sign gets an int parameter.

print out 1,-1 or 0 depending on the input

 */