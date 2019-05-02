package thread;

import java.util.concurrent.RecursiveTask;

/**
 * Created by szeru on 12/15/2018
 */
public class FibonacciForkJoin extends RecursiveTask<Integer> {
    final int n;
    FibonacciForkJoin(int n){
        this.n = n;
    }


    @Override
    protected Integer compute() {
        if(n <= 1){
            return n;
        }

        FibonacciForkJoin task1 = new FibonacciForkJoin(n-1);
        task1.fork();

        FibonacciForkJoin task2 = new FibonacciForkJoin(n-2);
        task2.fork();


        return task1.join() + task2.join();
    }
}
