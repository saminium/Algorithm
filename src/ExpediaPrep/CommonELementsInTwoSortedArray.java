package ExpediaPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by szeru on 4/7/2019
 */
public class CommonELementsInTwoSortedArray {

    public static Integer[] commonElementsInTwoSortedArray(int[] arr1, int[] arr2){

        int firstItem = arr1[0];
        int firstItemIndexInArr2 = 0;
        for(int i = 0; i < arr2.length; i++){
            if(arr2[i] == firstItem){
                firstItemIndexInArr2 = i;
                break;
            }
        }

        List<Integer> commons = new ArrayList<>();
        int i = 0;
        while( i < arr1.length){
            int arr2Index = (firstItemIndexInArr2) % arr2.length;
            int val = arr2[arr2Index];

            if(arr1[i] == val){
                commons.add(arr1[i]);
                i++;
                firstItemIndexInArr2++;
            }else if(arr1[i] < val){
                i++;
            }else if( arr1[i] > val) {
                firstItemIndexInArr2++;
            }
        }

        return commons.toArray(new Integer[commons.size()]);

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 6, 8, 9};
        int[] arr2 = {1, 6, 8, 10};

        System.out.println(Arrays.toString(commonElementsInTwoSortedArray(arr1, arr2)));
    }
}
