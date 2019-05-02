package exercise;

import java.util.*;

/**
 * Created by szeru on 3/13/2019
 */
public class CommonElements {

    public static Integer[] getCommonElements(int[] arr1, int[] arr2) {

        //assume we don't have duplicates in each array
        Map<Integer, Integer> valueCountMap = new HashMap<>();
        for(int i = 0 ; i < arr1.length; i++){
            if(valueCountMap.get(arr1[i]) == null){
                valueCountMap.put(arr1[i], 1);
            }
        }
        List<Integer> dups = new ArrayList<>();
        for(int i = 0 ; i < arr2.length; i++){
            if(valueCountMap.get(arr2[i])!= null){
                dups.add(arr2[i]);
            }
        }

        return dups.toArray(new Integer[dups.size()]);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 6, 8, 9};
        int[] arr2 = {1, 6, 8, 10};
        System.out.println(Arrays.toString(getCommonElements(arr1, arr2))); //1,6,8


        int[] array1B = {1, 2, 9, 10, 11, 12};
        int[] array2B = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};
        System.out.println(Arrays.toString(getCommonElements(array1B, array2B)));// should return [1, 2, 9, 10, 12] (an array).
    }
}
