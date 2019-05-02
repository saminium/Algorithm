package exercise;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by szeru on 3/19/2019
 */
public class ProductOfAllUnique {

    private static int productOfAllUnique(int[] input){

        Set<Integer> unique = new HashSet<>();
        int product = 1;
        for(int i = 0 ; i < input.length; i++){
            if(!unique.contains(input[i])){
                product *= input[i];
                unique.add(input[i]);
            }
        }
        return product;
    }

    public static void main(String[] args) {
        int [] arrA = {1, 6, 4, 3, 2, 2, 3, 8, 1};
        System.out.println(productOfAllUnique(arrA));
    }
}
