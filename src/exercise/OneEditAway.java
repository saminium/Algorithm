package exercise;

/**
 * Created by szeru on 3/14/2019
 */
public class OneEditAway {

    public static boolean isOneAway(String str1, String str2) {

        if (Math.abs(str1.length() - str2.length()) > 1) return false;

        int str1Leng = str1.length();
        int str2Leng = str2.length();
        int p1 = 0;
        int p2 = 0;
        int count = 0;


        return (count != 1)? false : true;
    }

    public static void main(String[] args) {
        System.out.println(isOneAway("abcde", "abcd"));  // should return true
        System.out.println(isOneAway("abde", "abcde"));  // should return true
      //  isOneAway("a", "a");  // should return true
        //isOneAway("abcdef", "abqdef");  // should return true
        //isOneAway("abcdef", "abccef");  // should return true
        //isOneAway("abcdef", "abcde");  // should return true
        System.out.println(isOneAway("aaa", "abc"));  // should return false
        //isOneAway("abcde", "abc");  // should return false
        //isOneAway("abc", "abcde");  // should return false
        //isOneAway("abc", "bcc");  // should return false
    }
}
