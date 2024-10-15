package A_Arrays_and_Strings.A_Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _1207_Unique_Number_Of_Occurrences {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();
        for (int i : map.values()) {
            if (set.contains(i)) return false;
            set.add(i);
        }
        return true;
    }
}
