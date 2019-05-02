package quickselect;

/**
 * Created by szeru on 2/26/2019
 */
public class QuickSelect {

    public static void main(String[] args){
        int[] input = {5,3,9,7};
        System.out.println(findthKthSmalles(input, 0, input.length -1, 4));
    }

    private static int findthKthSmalles(int[] input, int start, int end, int kth) {



        int pivot = partition(input, start, end);
        if(pivot == kth){
            return input[pivot];
        }else if(kth < pivot){
            return findthKthSmalles(input, 0, pivot-1, kth);
        }else{
            return findthKthSmalles(input, pivot + 1, end , kth - pivot);
        }

    }

    private static int partition(int[] input, int start, int end) {
        int pivot = input[end];
        int lowerIndex = start;
            for(int i = start; i < end; i++){
                if(input[i] < pivot){
                    swap(input, i, lowerIndex);
                    lowerIndex++;
                }
            }

        swap(input, lowerIndex, end);
        return lowerIndex;
    }

    private static void swap(int[] array, int i, int pivotIndex) {
        int temp = array[pivotIndex];
        array[pivotIndex] = array[i];
        array[i] = temp;
    }
}
