package Practice_Tasks;

public class Practice_CitizenShip {
    public static void main(String[] args) {

        String name1 = "John";
        String citizenShip1 = "USA";
        String eligibleToVote = "USA";
        boolean x1 = citizenShip1 == eligibleToVote;
        System.out.println(name1 + " is eligible to vote for Donald Trump or Joe Biden?");
        System.out.println(x1);

        String name2 = "Jimmy";
        String citizenShip2 = "Korea";
        String eligibleToVote2 = "USA";
        boolean x2 = citizenShip2 == eligibleToVote2;
        System.out.println(name2 + " is eligible to vote for Donald Trump or Joe Biden?");
        System.out.println(x2);

    }
}

