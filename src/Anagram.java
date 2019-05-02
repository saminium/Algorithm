import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by szeru on 3/1/2019
 */
public class Anagram {

    // Complete the makeAnagram function below.
    // Complete the isValid function below.
    static String isValid(String s) {

        Map<Character, Integer> charCount = new HashMap();

        for(int i = 0; i < s.length(); i++){
            if(charCount.get(s.charAt(i)) == null){
                charCount.put(s.charAt(i), 1);

            }else if(charCount.get(s.charAt(i)) != null){
                charCount.put(s.charAt(i), charCount.get(s.charAt(i)) + 1);
            }
        }


        final List<Integer> collect = charCount.values().stream().sorted().collect(Collectors.toList());
        int diff = collect.get(collect.size()-1) - collect.get(0);
        if(diff > 1){
            return "NO";
        }else{
            return "YES";
        }



    }


    public static void main(String[] args){
        System.out.println(isValid("aabbccddeefghi"));
       // makeAnagram("cde", "abc");
    }
}
