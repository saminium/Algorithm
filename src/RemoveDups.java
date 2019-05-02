import java.util.Arrays;

/**
 * Created by szeru on 11/27/2018
 */
public class RemoveDups {

    public static void main(String[] args){

        int[] dup = new int[]{4,4, 5, 6, 2 ,2};
        System.out.println("Before clean \n" + Arrays.toString(dup));

        System.out.println("After clean \n" + Arrays.toString(removeDups(dup)));
    }
    public static int[] removeDups(int[] arr){
        int[] bookKee = new int[arr.length * 2];
        int[] cleanArry = new int[arr.length];

        Arrays.fill(bookKee, 0);
        Arrays.fill(cleanArry, 0);
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            int val = arr[i];
            bookKee[val] = bookKee[val] + 1;

            if(bookKee[val] == 1){
                cleanArry[index] = val;
                index++;
            }

        }
        //clean the rest of 0's at the end
        int[] clean = new int[index];
        for(int i = 0; i < index; i++){
            clean[i] = cleanArry[i];
        }
        return clean;
    }
}
