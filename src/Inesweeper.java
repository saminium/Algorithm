import java.util.Arrays;

/**
 * Created by szeru on 1/19/2019
 */
public class Inesweeper {

    public static void main(String[] args){

        int[][] field = new int[4][4];

        for(int i = 0; i < field.length; i++){
            Arrays.fill(field[i], 0);
        }
        //set the bonb values

       placeBomb(field, 0, 0);
    }

    private static void placeBomb(int[][] field, int row, int col) {

        //assigne the bomb value to -1 and the surrounding increment by 1

        for(int i = row -1; i <= row + 1; i++ ){
            for(int j = col -1; j <= col + 1; j++ ){

                //check if the rows are in the surrounding
                if(i >= 0 && j >= 0){
                    if(field[i][j] == 0){
                        field[i][j] = -1;
                        assigAddjecent(field, i, j);
                    }
                }
            }
        }
    }

    private static void assigAddjecent(int[][] field, int row, int col) {
        if(row - 1 >= 0 && col - 1 >= 0 ){
            field[row-1][col-1] =  field[row-1][col-1] + 1;
        }
        if(row + 1 <= field[0].length && col + 1 <= field.length ){
            field[row-1][col-1] =  field[row-1][col-1] + 1;
        }
    }

    public static int[][] click(int[][] field, int row, int col, int itemRow, int itemCol){

        return null;
    }
}
