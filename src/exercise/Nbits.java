package exercise;

import java.util.Arrays;

/**
 * Created by szeru on 3/19/2019
 */
public class Nbits {
    int[] arrA;
    public Nbits(int n) {
        arrA = new int[n];
    }

    public void nBits(int n) {
        if (n <= 0) {
            System.out.println(Arrays.toString(arrA));
        } else {
            arrA[n - 1] = 0;
            nBits(n - 1);
            arrA[n - 1] = 1;
            nBits(n - 1);
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        int n = 3;
        Nbits i = new Nbits(n);
        i.nBits(n);
    }

}
