import java.time.LocalDateTime;

/**
 * Created by szeru on 11/10/2018
 * this version of bubble sort runs on O(n) for already sorted input
 * but the speed will be run by half speed because the length isdecressed for every sorted iteration
 */
public class BubbleSort2 {

    static int[] array = new int[]{5, 6, 9, 13, 15, 17, 1, 2, 0, 25, 36, 598, -8, -69874};

    public static void main(String[] args){
        BubbleSort2 bubbleSort = new BubbleSort2();
        bubbleSort.bubbleSort();
    }



    public  void bubbleSort(){
        int start = LocalDateTime.now().getSecond();
        boolean sorted = false;
        int len = array.length-1;
        while(!sorted){
            sorted = true;
            for(int i = 0; i < len; i++) {
                if (array[i] > array[i + 1]) {
                    swap(i, i + 1);
                    sorted = false;
                }

            }
            len--;
        }
    }

    private  void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
