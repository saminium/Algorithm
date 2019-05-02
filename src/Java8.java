import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by szeru on 12/14/2018
 */
public class Java8 {

    public static void main(String[] args){

        int[] ints = new int[]{5,6,7,3,9,1,2,7, -698};

        Map<Integer, Integer> m = new HashMap<>();


        //find min
       IntStream.of(ints).min().ifPresent(System.out::println);



    }
}
