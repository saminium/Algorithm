package QuickSort;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by szeru on 12/5/2018
 */
public class MainQuickSort {


    public static void main(String[] args){
        int arr[] = {64,25,12,22,11};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] array, int start, int end){
        if(start  < end) {
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
    }

    private static int partition(int[] array, int start, int end) {
       int pivot = array[end];
       int lowerIndex = start - 1;

       for(int j = start; j <= end -1; j++){
           if(array[j] <= pivot){
               lowerIndex++;
               swamp(array, lowerIndex, j);
           }
       }
       swamp(array, lowerIndex + 1, end);
       return lowerIndex + 1;
    }

    private static void swamp(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
