import java.util.Vector;

/**
 * Created by szeru on 10/29/2018
 */
public class BinarySearch {

    public boolean binarySearch(int[] input, int value, int lowerBound, int upperBound){

        if(lowerBound > upperBound) return false;
        int middle = (lowerBound + upperBound) / 2;
        if(input[middle] == value) return true;

        if(input[middle] < value){
            return binarySearch(input, value, lowerBound, middle -1);
        }else{
            return binarySearch(input, value, middle + 1 , upperBound);
        }
    }

    Vector vector = new Vector();

}
