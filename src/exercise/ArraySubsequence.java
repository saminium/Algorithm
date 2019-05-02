package exercise;

/**
 * Created by szeru on 3/19/2019
 */
public class ArraySubsequence {

    public static void arraySubsequence(int[] arr){

        int len = arr.length;

        for(int i = 0; i < len; i++){
            for(int j = i+1; j<len; j++){
                System.out.println(arr[i] + "" + arr[j]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3, 4};
        arraySubsequence(arr);
    }
}
