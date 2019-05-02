package hackerrank;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by szeru on 2/19/2019
 */
public class MissingWords {

    public static void main(String[] args){
        String s = "Insert statements for procedure here";
        String t = "statements for ";
        System.out.println(getMissingWords(s.toLowerCase(), t.toLowerCase()));


    }

    private static Set<String> getMissingWords(String input, String subsequences) {

        final String[] inputWords = input.split(" ");
        final String[] subseqWords = subsequences.split(" ");

        final Set<String> words = Stream.of(subseqWords).collect(Collectors.toSet());
        Set<String> missingwords = new HashSet<>();
        Set<String> longestSubSeq = new HashSet<>();
        Stream.of(inputWords).forEach(word ->{
            if(!words.contains(word)){
                missingwords.add(word);
            }else{
                longestSubSeq.add(word);
            }
        } );

        return missingwords;
    }
}
