package exercise;

/**
 * Created by szeru on 3/19/2019
 */
public class StairClimbing {

    public static int countStair(int stairs){
        int[] arr = new int[stairs + 1];
        return countStair(stairs, arr);
    }

    private static int countStair(int stairs, int[] arr) {
        if(stairs == 1) return 1;
        if(stairs == 2) return 2;

        if(arr[stairs] > 0) return arr[stairs];

        arr[stairs] = 1 + countStair(stairs - 1, arr ) + countStair(stairs - 2, arr);

        return arr[stairs];

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(countStair(n));
    }
}
