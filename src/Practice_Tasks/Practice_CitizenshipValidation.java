package Practice_Tasks;

public class Practice_CitizenshipValidation {
    public static void main(String[] args) {

        String name1 = "John";
        String citizenShip1 = "USA";
        String eligibleToVote1 = "USA";
        boolean V1 = citizenShip1 == eligibleToVote1;
        System.out.println(name1 + " is eligible to vote for Donald Trump or Joe Biden?");
        System.out.println(V1);

        String name2 = "Jimmy";
        String citizenShip2 = "Korea";
        String eligibleToVote2 = "USA";
        boolean V2 = citizenShip2 == eligibleToVote2;
        System.out.println(name2 + " is eligible to vote for Donald Trump or Joe Biden?");
        System.out.println(V2);

    }
}

