package ExpediaPrep;

import java.util.Arrays;

/**
 * Created by szeru on 4/11/2019
 */
public class LongestPalindrom {

    public static void LPS(String input) {
        int k =0;
        int j = 0;
        int[][] pals = new int[2][input.length() + 1];
        int low = 0;
        int high = 0;
        //row 0 for odd and row 1 for even
        int maxIndex = 0;
        /**
        for (int i = 0; i < input.length(); i++) {
            low = i - 1;
            high = i + 1;
            int max = 0;
            while (low >= 0 && high < input.length() && (input.charAt(low) == input.charAt(high))) {
                pals[0][i] = max;
                max++;
                high++;
                low--;
            }

            if (max > maxIndex) {
                maxIndex = max;
                k = low + 1;
                j = high;
            }


        } **/
        int evenMax = 0;
        for(int m = 0; m< input.length(); m++){
            int max = 0;
            int h = m + 1;
            int l = m;
            while(m >= 0 && h <= input.length() && (input.charAt(l) == input.charAt(h))){
                pals[1][m] = max++;
                h++;
                l--;
            }

            if(max > evenMax) {
                evenMax = max;
                k = l + 1;
                j = h;
            }
        }

        System.out.println(Arrays.toString(pals[0]));
        System.out.println(Arrays.toString(pals[1]));

        final String substring = input.substring(k, j);
        System.out.println(substring);

    }

    public static void main(String[] args) {
         LPS("caac");
        //LPS("forgeeksaskeegrof");
    }
}
