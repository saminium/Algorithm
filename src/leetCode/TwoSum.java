package leetCode;

import java.util.Arrays;

/**
 * Created by szeru on 3/6/2019
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] twoSum = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (num == nums[j]) {
                    twoSum[0] = i;
                    twoSum[1] = j;
                    break;
                }
            }

        }
        return twoSum;
    }

    public static void main(String[] args) {
        int[] input = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(input, target)));
    }
}
