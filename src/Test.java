import QuickSort.MainQuickSort;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by szeru on 1/19/2019
 */
public class Test{
    public static void main(String[] args) {

        int[] arr1 = {1, 5, 8, 9, 10};

        // System.out.println(maxRev(5, arr1));


        int[] arr2 = {7, 9, 11,1, 2, 3, 5 };

        //System.out.println(findCommonElements(arr1, arr2));
        twoNumbersTofindSum(arr2, 5);


        // System.out.println(fib(43));

        // System.out.println(fibRec(43));
    }



    private static int fib(int n){

        if(n == 0 || n == 1){
            return n;
        }

        return fib(n-1) + fib(n-2);
    }

    private static int fibRec(int n){

        int[] fibResults = new int[n+1];

        fibResults[0] = 0;
        fibResults[1] = 1;

        for(int i = 2; i <= n; i++){

            fibResults[i] = fibResults[i-1] + fibResults[i-2];
        }

        return fibResults[n];

    }

    private static void twoNumbersTofindSum(int[] input, int n){

        if(input.length < 2){return;}

        // Arrays.sort(input);


        MainQuickSort.quickSort(input, 0, input.length - 1);
        quickSort(input, 0, input.length - 1);

        int left = 0;
        int right = input.length - 1;

        while(left < right){

            int sum = input[left] + input[right];

            if(sum == n){

                System.out.println("(" + input[left] + "," + input[right] + " )");
                left = left + 1;
                right = right -1;
            }

            if(sum < n) {
                left++;
            }else{

                right--;
            }
        }

    }

    private static int maxRev(int n, int[] prices){

        if(n == 0) return 0;
        int max = 0;

        for(int i = 0; i < n; i++){

            int temp = prices[n-i -1] + maxRev(i, prices);

            if(temp > max){
                max = temp;
            }
        }

        return max;
    }

    private static void quickSort(int[] input, int start, int end){

        if(input.length > 1) {

            int pivot = partition(input, start, end);

            quickSort(input, 0, pivot - 1);
            quickSort(input, pivot + 1, end);
        }
    }

    private static int partition(int[] input, int start, int end){

        int pivot = input[end];
        int startIndex = -1;

        for(int i = 0; i <= end - 1; i++){
            if(input[i] < pivot){
                startIndex++;
                swamp(input, i, startIndex);
            }
        }
        swamp(input, startIndex+1, end);
        return startIndex+1;
    }

    public static void swamp(int[] input, int from, int to){

        int temp = input[from];
        input[from] = input[to];
        input[to] = temp;
    }
}