package JavaInterviewCodingTasksAndSolutions;
import java.util.Arrays;
public class FindUnique {

    public static void main(String[] args) {

        String str = "aaaabbbbbcddddeeeeffffg"; // expected result: c g

        char[] arr = str.toCharArray(); // [a, a, a, b, b, b, b, b, c, d, d, d, d, e, e, e, e, f, f, f, f, g]
        // String[] arr = str.split("");

        System.out.println(Arrays.toString(arr));

        for(int j = 0; j <= arr.length-1; j++) {    //// purpose of this loop is to iterate through the char one at a time

            char element = arr[j];
            int frequency = 0;             // resetting the value with each iteration of the outer loop

            for (int i = 0; i <= arr.length - 1; i++) {
                if (arr[i] == element) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                System.out.print(element + " ");
            }

        }
    }
}