package Replit_Tasks;

import java.util.Arrays;

public class Replit143_Arrays_MultiplicationTable {
    public static void main(String[] args) {
        int [][] multiplicationTable = new int[10][10];

        int row= 1;
        int column = 1;

        for( int i = 0; i <multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable.length; j++) {
                multiplicationTable[i][j] = (i+1)*(j+1);
            }
        }









        //Do not modify below line it will be used to test your code. And
        //Can be used by you while developing your code
        System.out.print(Arrays.deepToString(multiplicationTable));
    }
}
