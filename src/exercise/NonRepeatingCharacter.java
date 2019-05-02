package exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by szeru on 3/14/2019
 */
public class NonRepeatingCharacter {

    public static Character nonRepeating(String input){
        char[] chars = input.toCharArray();
        Map<Character, Integer> charsCountMap = new LinkedHashMap<>();

        for(int i = 0; i < chars.length; i++){
            if(charsCountMap.get(chars[i]) == null){
                charsCountMap.put(chars[i], 1);
            }else{
                charsCountMap.put(chars[i], charsCountMap.get(chars[i]) + 1);
            }
        }

        for(char c : chars){
            if(charsCountMap.get(c) == 1) return c;
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(nonRepeating("abcab")); // should return 'c'
        System.out.println(nonRepeating("abab")); // should return null
        System.out.println(nonRepeating("aabbbc")); // should return 'c'
        System.out.println(nonRepeating("aabbdbc")); // should return 'd'
    }
}
