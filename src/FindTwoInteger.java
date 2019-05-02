import javax.sound.midi.Soundbank;
import java.util.Arrays;

/**
 * Created by szeru on 1/19/2019
 */
public class FindTwoInteger {

    public static void main(String[] args){
        int[] arr2 = {7, 9, 11,1, 2, 3, 5 };

        //System.out.println(findCommonElements(arr1, arr2));
        find(arr2, 5);

    }
    public static void find(int[] input, int number){

        if(input.length < 2) return;

        Arrays.sort(input);

        int left = 0;
        int right = input.length - 1;

        while (left < right){
            System.out.println(left +" : " + right);
            int sum = input[left] + input[right];
            System.out.println(sum);
            if(sum == number){
                System.out.println("Pairs are (" + input[left] + "," + input[right] +")");
                left++;
                right--;
            }else if(sum < number){
                left++;
            }else{
                right--;
            }
        }
    }
}
