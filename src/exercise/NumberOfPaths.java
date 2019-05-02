package exercise;

/**
 * Created by szeru on 3/19/2019
 */
public class NumberOfPaths {

    public static int numberOfPaths(int[][] matrix){

        int[][] result = new int[8][4];

        result[0][0] = 1;

        for(int i =0 ; i < 7; i++){
            result[0][i] = 1;
        }

        for(int j = 0 ; j < 3; j++){
            result[j][0] = 1;
        }

        for(int i = 1; i < 7; i++){
            for(int j = 1; j < 3; j++){
                result[i][j] = result[j][i-1] + result[j-1][i];
            }
        }

        return result[7 -1][3-1];
    }

    public static void main(String[] args) {
        int arrA [][] = {{1,1,1},{1,1,1},{1,1,1}};

       // System.out.println("No Of Path (Recursion):- " +numberOfPaths.count(arrA,0,0));
        System.out.println("No Of Path (DP):- " + numberOfPaths(arrA));
    }
}
