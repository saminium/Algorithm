package exercise;

/**
 * Created by szeru on 3/19/2019
 */
public class LCA {

    public static int lcaCount(String str1, String str2){

        if (str1.length() == 0 || str1.length() == 0) {
            return 0;
        }

        int str1Len = str1.length();
        int str2Len = str2.length();

        if(str1.charAt(str1Len - 1) == str2.charAt(str2Len -1)){
            return 1 + lcaCount(str1.substring(0, str1Len -1), str2.substring(0, str2Len -1));
        }else{
            return Math.max(
                    lcaCount(str1.substring(0, str1Len), str2.substring(0, str2Len -1)),
                    lcaCount(str1.substring(0, str1Len-1), str2.substring(0, str2Len)));
        }
    }

    public static void main(String[] args) {
        String A = "ACBDEA";
        String B = "ABCDA";
        System.out.println("LCS :" + lcaCount(A, B));
    }
}
