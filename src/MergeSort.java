import java.util.*;

/**
 * Created by szeru on 11/17/2018
 */
public class MergeSort extends PriorityQueue{


    public static void main(String[] args){
        int[] arr = new int[]{2, 5, 1, 3, 7, 4, 2, 3, 9, 8, 6, 3};
     //   mergesort(arr, new int[arr.length], 0, arr.length-1);
     //   System.out.println(arr);

        Map<String, String> map = new Hashtable<>();
        map.put("1", "v");
        map.put("1", "2");
        System.out.println(map.entrySet());

    }

    private static void mergesort(int[] arr, int[] temp, int lowerBound, int upperBound) {
        if(lowerBound >= upperBound){
            return;
        }


        int mid = (upperBound + lowerBound ) / 2;
        mergesort(arr, temp, lowerBound, mid);
        mergesort(arr, temp, mid+1, upperBound);
        mergHalves(arr, temp, lowerBound, upperBound);

    }

    private static void mergHalves(int[] arr, int[] temp, int lowerBound, int upperBound) {
        int lowerEnd = (lowerBound + upperBound) / 2;
        int upperStart = lowerBound + 1;
        int index = 0;

        while(lowerBound <= lowerEnd && upperStart <= upperBound){
            if(arr[lowerBound] < arr[upperStart]){
                temp[index] = arr[lowerBound];
                lowerBound++;
            } else {
                temp[index] = arr[upperStart];
                upperStart++;
            }

            index++;
        }

        System.arraycopy(arr, lowerBound, temp, index, lowerEnd - lowerBound + 1);
        System.arraycopy(arr, upperStart, temp, index, upperBound - upperStart + 1);
        System.arraycopy(temp, 0, arr, 0, temp.length);
    }



}
