package Replit_Tasks;

public class Replit123_UtopianTree {
    public static void main(String[] args) {

    int totalTreeSize=0;
    int tree=0;
    int growth=0;
    for(int i=1, j=1; i<=3; i++){
        tree++;
        totalTreeSize++;
        System.out.println("year "+ i+ "- growth "+j+ " cm "+"\ntree size: "+totalTreeSize+" cm ");
    }

    for(int i=4, j=2; i<=10; i++)

    {
        tree++;
        growth += 2;
        totalTreeSize += 2;
        System.out.println("year " + i + "- growth " + j + " cm " + "\ntree size: " + totalTreeSize + " cm ");
    }
}
}