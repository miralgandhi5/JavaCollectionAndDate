package ArraySortByFrequency;

import java.util.Comparator;
import java.util.Map;

/**
 * Created by miral on 6/24/2017.
 */
public class FrequencyComparator implements Comparator<Integer> {
    Map<Integer, Integer> FrequencyMap;

    public FrequencyComparator(Map<Integer, Integer> FrequencyMap) {
        this.FrequencyMap = FrequencyMap;
    }

    @Override
    public int compare(Integer k1, Integer k2) {
        Integer first = FrequencyMap.get(k1);
        Integer second = FrequencyMap.get(k2);

        int result = first.compareTo(second);

        return result == 0 ? k1.compareTo(k2) : result;
    }
}

