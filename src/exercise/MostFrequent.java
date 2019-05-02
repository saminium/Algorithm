package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by szeru on 3/17/2019
 */
public class MostFrequent {

    public static Integer mostFrequent(int[] array) {

        Map<Integer, Integer> valueCountMap = new HashMap<>();
        if (array.length == 0) return null;
        for (int i = 0; i < array.length; i++) {
            if (valueCountMap.get(array[i]) == null) {
                valueCountMap.put(array[i], 1);
            } else {
                valueCountMap.put(array[i], valueCountMap.get(array[i]) + 1);
            }
        }

        int max = 0;
        int item = 0;
        for (Map.Entry entry : valueCountMap.entrySet()) {
            if (max < (Integer) entry.getValue()) {
                max = (Integer) entry.getValue();
                item = (Integer) entry.getKey();
            }
        }
        return item;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 1, 2, 1, 3, 3, 3};
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};
        System.out.println(mostFrequent(array5));
    }
}
