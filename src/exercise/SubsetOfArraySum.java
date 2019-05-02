package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by szeru on 3/19/2019
 */
public class SubsetOfArraySum {

    public static Integer[] subSetOfArry(int[] input, int sum){
        List<Integer> sub = new ArrayList<>();
        int currentSum  = 0;
        for(int i = 0; i < input.length; i++){
            currentSum += input[i];
            if(currentSum <= sum){
                sub.add(input[i]);
            }else if(currentSum > sum){
                currentSum -= input[i];
            }
            if (currentSum == sum){
                return sub.toArray(new Integer[sub.size()]);
            }

        }
       return null;
    }

    public static void main(String[] args) {
        int[] A = { 2, 7, 1, 1, 1, 1};
        System.out.println(Arrays.toString(subSetOfArry(A, 6)));
    }
}
