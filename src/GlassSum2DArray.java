/**
 * Created by szeru on 2/28/2019
 */
public class GlassSum2DArray {

    static int hourglassSum(int[][] arr) {

        //00, 01, 02 , 01,02,03, 02,3,4, 3,4,5
        //    11          12        13     14
        //20, 21, 22,  21,22,23, 22,23,24, 23,24,25
        int maxSum = Integer.MIN_VALUE;

        for (int row = 0; row + 2 < arr.length; row++) {

            int middle = 1;
            int step = 0;
            while (step < 4 && step < arr[row].length - 2) {
                int sum = 0;

                for (int i = step; i <= step + 2; i++) {
                    sum += arr[row][i];
                }


                sum += arr[row + 1][middle];
                middle++;

                for (int j = step; j <= step + 2; j++) {
                    sum += arr[row + 2][j];
                }

                if (sum > maxSum) {
                    maxSum = sum;
                }

                step++;
            }


        }


        return maxSum;
    }

    public static void main(String[] args) {
        int[][] input = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}};
        System.out.println(hourglassSum(input));
    }
}
