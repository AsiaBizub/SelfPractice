package Replit_Tasks;

import java.util.Scanner;

public class Replit137_Array_ReverseSentence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();


        //TODO: start your code here

        String [] arr=sentence.split(" ");
        String reverse =arr[0];

        for(int i=arr.length-1;i>=0;i--){

            reverse=arr[i];
            System.out.println(reverse);

        }
    }




        /*
        String reversed = "";

        String [] words = sentence.split(" ");
        for (int i = words.length-1; i >=0; i--) {
            if (i > 0) {
                reversed += words[i] + " ";
            } else{
                reversed += words[i];
            }
        }
        System.out.print(reversed); */

    }

/*
Given a String variable sentence, write code to type each word in separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java
 */


/*
DEBUGGED ANSWER:
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();

    //TODO: Type your code below
    String[] arr = sentence.split(" "); // Step 1: Spliting our sentence for array
    String reverseOrder = ""; // Step 2: Creating new String to store our reverce sentence

    // Step 3: Taking words from our 1st array "arr" and assigning it to our new sentence "reverseOrder"
      for(int i = arr.length-1; i>=0; i--){
        reverseOrder += " " + arr[i]; // fun is Java
      }
      // Step 4: Because of this part when we're splitting our words with space (+= " "),
      // we have one more space in the beginning, so we delete it here:
      reverseOrder = reverseOrder.substring(1);

    // Step 5: So we could use our reversed sentence in the For Each Loop, we have to have an array
    // Thus we put our reversed sentence into a new array "arr2"
    String[] arr2 = reverseOrder.split(" ");

    // Step 6:For Each Loop takes every piece from our array and works with it in its statement separately
    // String - we specify the type of variables that we're going to work with
    // reverse - so we could work with every piece from our array separately in our statement,
    // we have to call it somehow, thus "reverse" - it's the name of every called piece from array
    for(String reverse : arr2){
      System.out.println(reverse); // it's the statement, we want to print every piece from our array separately
    }


  }
}
 */