package mergsort;

import java.util.Arrays;

/**
 * Created by szeru on 11/28/2018
 */
public class MergSortMain {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 1, 7, 4, 2, 3, 9, 8, 6, 3};
        mergsort(arr, new int[arr.length], 0, arr.length - 1);
        System.out.println(arr);
    }

    public static void mergsort(int[] input, int[] temp, int start, int end) {

        if (start >= end) {
            return;
        }
        int mid = (start + end ) / 2;
        mergsort(input, temp, start, mid);
        mergsort(input, temp, mid + 1, end);
        merge(input, temp, start, end);


    }

    public static int[] merge(int[] input, int[] temp, int start, int end) {
        int mid = (start + end) / 2;
        int leftStart = start;
        int leftEnd = mid;
        int rightStart = mid + 1;
        int size = end - start + 1;

        int index = leftStart;
        while (leftStart <= leftEnd && rightStart <= end) {
            if (input[leftStart] <= input[rightStart]) {
                temp[index] = input[leftStart];
                leftStart++;
            } else {
                temp[index] = input[rightStart];
                rightStart++;
            }
            index++;
        }


        System.arraycopy(input, leftStart, temp, index, leftEnd - leftStart + 1);
        System.arraycopy(input, rightStart, temp, index, end - rightStart + 1);
        System.arraycopy(temp, leftStart, input, leftStart, size);
        System.out.println(Arrays.toString(input));
        return temp;
    }
}
