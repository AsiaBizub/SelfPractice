package Practice_Tasks;

public class Practice_Divisibility {
    public static void main(String[] args) {
        int num1 = 65;

        boolean divisibleBy2 = num1 % 2 < 1;
        boolean divisibleBy3 = num1 % 3 < 1;
        boolean divisibleBy5 = num1 % 5 < 1;

        System.out.println(num1+" is divisible by 2: "+divisibleBy2);
        System.out.println(num1+" is divisible by 2: "+divisibleBy3);
        System.out.println(num1+" is divisible by 2: "+divisibleBy5);

        System.out.println("=======================================");


        int num2 = 80;
        boolean isdivisibleBy2 = num2 % 2 < 1;
        boolean isdivisibleBy3 = num2 % 3 < 1;
        boolean isdivisibleBy5 = num2 % 5 < 1;

        System.out.println(num2+" is divisible by 2: "+isdivisibleBy2);
        System.out.println(num2+" is divisible by 2: "+isdivisibleBy3);
        System.out.println(num2+" is divisible by 2: "+isdivisibleBy5);

    }
}
