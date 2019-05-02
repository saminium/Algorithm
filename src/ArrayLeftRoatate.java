import java.util.Arrays;

/**
 * Created by szeru on 2/28/2019
 */
public class ArrayLeftRoatate {

    static int[] rotLeft(int[] a, int d) {

        int[] temp = new int[d];
        for(int i = 0; i < d ; i++){
            temp[i] = a[i];
        }

        for(int j = 0; j < a.length - d; j++){
            a[j]= a[j + d ];
        }
        int k = a.length - d;
        while(k < a.length){
            for(int m = 0; m < temp.length; m++ ){
                a[k] = temp[m];
                k++;
            }
        }
        return a;
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(rotLeft(arr, 6)));

    }
}
