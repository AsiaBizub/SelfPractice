package Practice_Tasks;

public class Practice_LeapYear {
    public static void main(String[] args) {

        int year = 2020;
        boolean leapYear = year%4 < 1;

        System.out.println(year+" is a leap year: "+ leapYear);

    }
}
