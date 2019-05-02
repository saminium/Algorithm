package hackerrank;

import com.sun.org.apache.xpath.internal.SourceTreeManager;

/**
 * Created by szeru on 2/26/2019
 */
public class Permutation {

    public static void main(String[] args){
        String input ="God";
        permutation(input);
    }

    private static void permutation(String input) {
        permutation("", input);
    }

    private static void permutation(String perm, String input) {

        System.out.println(perm+input);
        if(input.isEmpty()) {
            return;
        }else{
            for(int i = 0; i < input.length(); i++){
                permutation(perm + input.charAt(i), input.substring(0, i) + input.substring(i + 1, input.length()));

            }
        }




    }
}
