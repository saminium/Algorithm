package insertion;

import java.util.Arrays;

/**
 * Created by szeru on 12/8/2018
 */
public class InsertionSort {

    /**
     * pick a card put the the approprate value in to the sorted array to the left
     */

    public static void sort(int[] array){

        for(int i = 1; i < array.length; i++){
            int key = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j + 1] = key;

        }
    }

    public static void main(String[] args){
        int arr[] = {64,25,12,22,11};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
