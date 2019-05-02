package exercise;

/**
 * Created by szeru on 3/18/2019
 */
public class RevereseWordInString {

    public static String reverseWordsInString(String input){

        if(input.length() == 0) return null;
        StringBuilder sb = new StringBuilder();

        String[] words = input.split(" ");
        for(int i = words.length - 1; i >= 0; i--){
            sb.append(words[i] + " ");
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String input = "The sky is Blue";
        System.out.println(reverseWordsInString(input));
    }
}
