package Replit_Tasks;

import java.util.Arrays;

public class Replit132_2D_Array_TicTacToe {
    public static void main(String[] args) {
        char [] [] tictactoe = { {' ',' ',' '} , {' ',' ',' '} , {' ',' ',' ',} };
        int i =0;
        int j =0;
        for(i=0;i<3; i++){
            for(j=0;j<3;j++)
                tictactoe [i][j]=' ';
        }
        System.out.println(Arrays.deepToString(tictactoe));

    }
}
