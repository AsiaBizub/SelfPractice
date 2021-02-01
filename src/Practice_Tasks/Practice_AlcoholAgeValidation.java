package Practice_Tasks;

public class Practice_AlcoholAgeValidation {
    public static void main(String[] args) {
        String name1 = "James";
        String name2 = "Aaron";

        int age1 = 18;
        int age2 = 39;

        boolean isEligible1 = age1 > 21;
        boolean isEligible2 = age2 > 21;

        System.out.println(name1+" is eligible to buy alcohol: "+isEligible1);
        System.out.println(name2+" is eligible to buy alcohol: "+isEligible2);


    }
}
