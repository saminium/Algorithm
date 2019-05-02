/**
 * Created by szeru on 11/24/2018
 */
public class FastAlgorithm {

    public static void main(String[] args){
        int[] arr = new int[] {-10, -5, 0, 3, 7};
        int[] arr2 = new int[] {1, 2, 5, 8, 17};
        final int fixedPoint = findFixedPoint(arr, 0, arr.length);
        System.out.println(fixedPoint);
        final int fixedPoint2 = findFixedPoint(arr2, 0, arr.length);
        System.out.println(fixedPoint2);
    }
    public static int findFixedPoint(int[] array, int start, int end){
        if(array[0] == 0) return 0;
        if(array[0] > 0) return -1;
        int mid = (start + end) / 2;
        if(array[mid] == mid) return mid;

        if(start < end){
            if(array[mid] < mid){
                return findFixedPoint(array, mid + 1, end);
            }else{
                return findFixedPoint(array, start, mid -1);
            }
        }
       return -1;
    }
}
