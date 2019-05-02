package exercise;

/**
 * Created by szeru on 3/14/2019
 */
public class ArrayRotation {

    public static boolean isRotation(int[] arr1, int[] arr2){

        if(arr1.length != arr2.length) return false;

        int key = arr1[0];
        int arr2Index = -1;
        for(int i = 0; i < arr2.length; i++){
            if(arr2[i] == key){
                arr2Index = i;
                break;
            }
        }

        if(arr2Index == -1) return false;

        for(int j = 0; j < arr1.length; j++){
            int k = ( arr2Index + j ) % arr2.length;
            if(arr1[j] != arr2[k]) return false;
        }


        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2a = {4, 5, 6, 7, 8, 1, 2, 3};
        System.out.println(isRotation(array1, array2a)); // should return false.
        int[] array2b = {4, 5, 6, 7, 1, 2, 3};
        System.out.println(isRotation(array1, array2b)); // should return true.
        int[] array2c = {4, 5, 6, 9, 1, 2, 3};
        System.out.println(isRotation(array1, array2c));// should return false.
        int[] array2d = {4, 6, 5, 7, 1, 2, 3};
        System.out.println(isRotation(array1, array2d)); // should return false.
        int[] array2e = {4, 5, 6, 7, 0, 2, 3};
        // isRotation(array1, array2e) should return false.
        int[] array2f = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(isRotation(array1, array2f)); // should return true.
    }
}
