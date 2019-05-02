import java.util.Arrays;

/**
 * Created by szeru on 11/6/2018
 */
public class BubbleSort1 {


    static int array[] = {64,25,12,22,11};

    public static void main(String[] args) {

        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array){
        boolean isSorted = false;

        while(!isSorted){
            isSorted = true;
            for (int i = 0; i < (array.length - 1) ; i++){
                if(array[i] > array[i + 1]){
                    int temp = array[i + 1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    isSorted = false;
                }
            }
        }
    }

}
