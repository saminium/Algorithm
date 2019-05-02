package exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by szeru on 12/17/2018
 */
public class Fibonnaci {

    /**
     * fib(4) = fib(4-1) + fib(4-2)
     * fib(0) = 0
     * fib(1) = 1
     */

    static int fib(int n, int[] memo){
     if(memo[n] < 0){
         if(n == 1 || n == 2){
             memo[n] = 1;
         }else {
             memo[n] = fib(n-1, memo) + fib(n-2, memo);
         }
     }
     return memo[n];
    }


    static int fib(int n, Map<Integer, Integer> memo){
        if(memo.get(n) != null){
            return memo.get(n);
        }else{
            if(n ==1 || n == 2){
                memo.put(n, 1);
            }else{
                int result = fib(n-1, memo) + fib(n-2, memo);
                memo.put(n, result);
            }
            return memo.get(n);
        }

    }

    public static void main(String[] args){
        int fibOf = 8;
        int[] memo = new int[fibOf + 1];

        Map<Integer, Integer> map = new HashMap<>();

        Arrays.fill(memo, -1);
        System.out.println("fib is: " + fib(fibOf, memo));
        System.out.println("fib is: " + fib(fibOf, map));
    }
}
