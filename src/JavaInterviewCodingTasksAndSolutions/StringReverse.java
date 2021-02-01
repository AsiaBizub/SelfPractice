package JavaInterviewCodingTasksAndSolutions;

public class StringReverse {

    public static void main(String[] args) {

        String str = "ABC";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.toCharArray()[i];
        }

        System.out.println(reverse);
    }
}






// Write a method that can reverse a String
// Ex. Reverse ("ABC"), expected result: CBA
