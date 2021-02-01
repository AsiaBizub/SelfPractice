package Replit_Tasks;

public class Replit150_Methods_5_Print_Rectangle {
    public static void printHollowRect() {
        // write your codes here
        for(int i=0; i<=5; i++){
            if(i==0 || i==5){
                for(int j=0; j<=5; j++){
                    System.out.print("*");
                }
            }
            if(i>=1 && i<=4){
                for(int k=0; k<=5; k++){
                    if(k==0 || k==5){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printHollowRect();
    }
}
/*
// write your codes here
        for(int i=0; i<=5; i++){
            if(i==0 || i==5){
                for(int j=0; j<=5; j++){
                    System.out.print("*");
                }
            }
            if(i>=1 && i<=4){
                for(int k=0; k<=5; k++){
                    if(k==0 || k==5){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printHollowRect();
    }
}









Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 1; i <= 1; i++) {

            System.out.println("xxx");

            for(int j = 1; j <= n; j++) {
                System.out.println("x x");
            }

            System.out.println("xxx");

        }

    }
}
 */