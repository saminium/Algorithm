package selectionSort;

import java.util.Arrays;

/**
 * Created by szeru on 12/7/2018
 */
public class SelectionSortMain {
    /**
     * Slection work finds the minimum value from the list and put it to the right place
     */

    public static void main(String[] args){
        int arr[] = {64,25,12,22,11};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] array) {

     for(int i= 0; i < array.length; i++){
         int minindex = i;

         for(int j = i; j < array.length; j++){
             if(array[j] < array[minindex]){
                 minindex = j;
             }
         }
         int temp = array[i];
         array[i] = array[minindex];
         array[minindex] = temp;
     }
    }
}

