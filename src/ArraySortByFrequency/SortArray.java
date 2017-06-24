package ArraySortByFrequency;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by miral on 6/22/2017.
 */

public class SortArray {
    public static void main(String[] args) {

        int[] ar = new int[]{1, 2, 3, 3, 1, 2, 4, 1, 3, 1};

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int value : ar) {
            if (frequency.containsKey(value)) {
                Integer count = frequency.get(value);
                frequency.put(value, ++count);
            } else {
                frequency.put(value, 1);
            }
        }
        FrequencyComparator comp = new FrequencyComparator(frequency);
        TreeMap<Integer, Integer> sortedMap = new TreeMap<Integer, Integer>(comp);
        sortedMap.putAll(frequency);
        for (Integer i : sortedMap.keySet()) {
            int element = sortedMap.get(i);
            for (int count = 1; count <= element; count++) {
                System.out.print(i + " ");
            }
        }
    }
}



