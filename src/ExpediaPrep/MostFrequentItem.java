package ExpediaPrep;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by szeru on 4/7/2019
 */
public class MostFrequentItem {

    public static int mostFrequentItem(int[] arr){

        Map<Integer, Integer> valueCountMap = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(valueCountMap.get(arr[i]) != null){
                valueCountMap.put(arr[i],valueCountMap.get(arr[i]) + 1);
            }else{
                valueCountMap.put(arr[i], 1);
            }
        }

        int maxCount = 0;
        int val = 0;
        final Set<Map.Entry<Integer, Integer>> entries = valueCountMap.entrySet();
        for(Map.Entry<Integer, Integer> entry: entries){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                val = entry.getKey();
            }
        }

        return val;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 7, 7, 3, 8 ,3, 2, 8, 2, 5};
        System.out.println(mostFrequentItem(arr));
    }
}
