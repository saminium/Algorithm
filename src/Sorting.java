import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by szeru on 10/27/2018
 */
public class Sorting {

    public static void main(String[] args) {
        System.out.println("Find Max from Array.....");
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 299};
        System.out.println("Max of the given array : " + Arrays.toString(intArray) + " is : " + findMaxElementInArray(intArray));
        System.out.println("Min of the given array : " + Arrays.toString(intArray) + " is : " + findMinElementInArray(intArray));

        System.out.println("Remove array element at a given index : " + 5 + " before remove " +
                Arrays.toString(intArray) + " after removing index 5: " + removeArrayElement(5, intArray) + " \n" + Arrays.toString(intArray));
        String input = "mom";
        System.out.println("Is the word Palindrom ? " + isPalindrom(input));




    }

    public static int findMaxElementInArray(int[] input) {
        int currentMax = input[0];

        for (int i = 1; i < input.length; i++) {
            if (input[i] > currentMax) currentMax = input[i];
        }
        return currentMax;
    }

    public static int findMinElementInArray(int[] input) {
        int currnetMin = input[0];

        for (int i = 1; i < input.length; i++) {
            if (input[i] < currnetMin) currnetMin = input[i];
        }
        return currnetMin;
    }

    public static int[] removeArrayElement(int index, int[] input) {
        int[] outPut = new int[input.length - 1];

        for (int i = 0; i < input.length - 1; i++) {
            if (i != index)
                outPut[i] = input[i];
        }
        return outPut;
    }

    public static boolean isPalindrom(String input) {

        final String split = String.valueOf(input.split("."));
        final String split1 = String.valueOf(split.split(" "));
        System.out.println(split1.toString());
        if (split1.length() == 0) {
            return false;
        }

        for (int i = 0; i <= split1.length() / 2; i++) {
            if (split1.charAt(i) != split1.charAt((split1.length() - 1) - i)) return false;
        }
        return true;
    }

    public static int[] removeDuplicatesOfIntArray(int[] input){
        int val = input[0];
        for(int i= 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                if (val == input[j]) {
                    removeDuplicatesOfIntArray(removeArrayElement(i, input));
                }

            }
            val = input[i];
        }
        return input;
    }

    public static void removeDupsLinear(int[] input){
        Map<Integer, Integer> auxilaryMap = new HashMap<>();
        int[] removed = new int[input.length];
        Arrays.fill(removed, -1);
        int index = 0;
        for(int i = 0; i<input.length; i++){
            if(auxilaryMap.get(i) < 1){
                auxilaryMap.put(i, 1);
                removed[index] = input[i];
                index++;
            }else{
                auxilaryMap.put(i, auxilaryMap.get(i) + 1);
            }
        }
    }
}
