package thread;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by szeru on 12/15/2018
 */
public class FibonacciMain {

    public static void main(String[] args){
        FibonacciForkJoin forkJoin = new FibonacciForkJoin(10);
        System.out.println("Fibonacci of 8 : " + forkJoin.compute() );

        Map<String, String> map = new HashMap();

        Collections.synchronizedMap(map);
    }
}

