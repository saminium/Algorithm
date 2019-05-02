import java.util.Arrays;

/**
 * Created by szeru on 2/26/2019
 */
public class MergeTwoSortedArrays {

    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,11,200,201};
        int[] arr2 = {5,6,7,8, 9, 10, 203};
        mergeArrays(arr1, arr2);
    }

    private static void mergeArrays(int[] arr1, int[] arr2) {
        int arr1Start = 0;
        int arr1End = arr1.length;
        int arr2Start = 0;
        int arr2End = arr2.length;

        int[] merged = new int[arr1.length + arr2.length];
        int index = 0;

      while(arr1Start < arr1End && arr2Start < arr2End){
          if(arr1[arr1Start] < arr2[arr2Start]){
              merged[index] = arr1[arr1Start];
              arr1Start++;
              index++;
          }else{
              merged[index] = arr2[arr2Start];
              arr2Start++;
              index++;
          }


      }

        while(arr1Start < arr1End){
            merged[index] = arr1[arr1Start];
            index++;
            arr1Start++;
        }
        while(arr2Start < arr2End){
            merged[index] = arr2[arr2Start];
            index++;
            arr2Start++;
        }

        System.out.println(Arrays.toString(merged));
    }
}
