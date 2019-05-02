package mergsort;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Arrays;

/**
 * Created by szeru on 12/1/2018
 */
public class MergSort {


    public static void mergSort(int[] array){
        mergSort(array, new int[array.length], 0, array.length-1);
    }

    private static void mergSort(int[] array, int[] temp, int start, int end) {
        if(start >= end){
            return;
        }

        int mid = (start + end ) / 2;
        mergSort(array, temp, start, mid);
        mergSort(array, temp, mid + 1, end);
        merge(array, temp, start, end);

    }

    private static void merge(int[] array,int[] temp, int start, int end) {

        int leftEnd = (start + end) / 2;
        int rightStart  = leftEnd + 1 ;
        int size = end - start  + 1;

        int leftStart = start;
        int index = start;

        while(leftStart <= leftEnd && rightStart <= end){
            if(array[leftStart] < array[rightStart]){
                temp[index] = array[leftStart];
                leftStart++;
            } else {
                temp[index] = array[rightStart];
                rightStart++;

            }
            index++;
        }

        //copy the rest of the elemenets
        System.arraycopy(array, leftStart, temp, index, leftEnd - leftStart + 1);
        System.arraycopy(array, rightStart, temp, index,  end  - rightStart+ 1);

        System.out.println(Arrays.toString(temp));
       // System.arraycopy(temp, leftStart, array, leftStart, size);
    }

    public static void main(String[] args) {

        int arr[] = {64,25,12,22,11};
        mergSort(arr);
       // System.out.println(Arrays.toString(arr));

    }
}
