package ExpediaPrep;

/**
 * Created by szeru on 4/7/2019
 */
public class IsRotationOfAnother {

    /** Sorted **/
    public static boolean isRotation(int[] arr1, int[] arr2){

        if(arr1.length != arr2.length) return false;

        int itemInArr2 = arr1[0];
        int indexOfItem = 0;

        for(int i = 0; i < arr2.length; i++){
            if(arr2[i] == itemInArr2){
                indexOfItem = i;
                break;
            }
        }

        for(int i = 0; i < arr1.length; i++){
            int index = (indexOfItem + i) % arr2.length;
            if(arr1[i] != arr2[index]) return false;
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
        System.out.println(isRotation(array1, array2e));// should return false.
        int[] array2f = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(isRotation(array1, array2f)); // should return true.
    }
}
