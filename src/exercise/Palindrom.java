package exercise;

/**
 * Created by szeru on 4/2/2019
 */

class Palindrome {
    public static boolean isPalindrome(String word) {
        if (word.length() == 1 || word.length() == 2) {
            return true;
        }
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return isPalindrome(word.substring(1, word.length() - 1));
        } else {
            return false;
        }


    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled".toLowerCase()));
    }


}

