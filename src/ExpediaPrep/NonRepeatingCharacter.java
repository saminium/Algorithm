package ExpediaPrep;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by szeru on 4/7/2019
 */
public class NonRepeatingCharacter {

    public static Character nonRepeating(String input){

        final char[] chars = input.toCharArray();
        Map<Character, Integer> charCount = new HashMap<>();
        for(int i= 0; i < chars.length; i++){
            if(charCount.get(chars[i]) == null){
                charCount.put(chars[i], 1);
            }else{
                charCount.put(chars[i], charCount.get(chars[i]) + 1);
            }

        }

        for(Map.Entry<Character, Integer> entry : charCount.entrySet()){
            if(entry.getValue() == 1) return entry.getKey();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(nonRepeating("abcab")); // should return 'c'
        System.out.println(nonRepeating("abab")); // should return null
        System.out.println(nonRepeating("aabbbc")); // should return 'c'
        System.out.println(nonRepeating("ajabd")); // should return 'd'
    }
}
