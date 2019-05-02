package exercise;


/**
 * Created by szeru on 1/2/2019
 */
public class Fibonacci {

    public static int fibonacci(int n){
        return fibonacci(n, new int[n + 1]);
    }

    private static int fibonacci(int i, int[] ints) {

        if(i == 0 || i == 1) return i;

        if(ints[i] == 0){
            ints[i] = fibonacci(i - 1, ints) + fibonacci(i - 2, ints);
        }
        return ints[i];
    }

    public static void main(String[] args){
        int fibOf = 10000;


        System.out.println("fib is: " + fibonacci(fibOf));

    }


}
