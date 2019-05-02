package hackerrank;

/**
 * Created by szeru on 2/19/2019
 */
public class FourthBit {

    public static void main(String[] args){
        final char[] toCharArray = Integer.toBinaryString(32).toCharArray();
        int fouth = toCharArray.length - 3;
        System.out.println(toCharArray[fouth]);


    }
}
