package A_Arrays_and_Strings.B_Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1331_Rank_Transform_Of_An_Array {

    public int[] arrayRankTransform(int[] arr) {
        int[] sortedUniqueArray = Arrays.stream(arr).distinct().sorted().toArray();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<sortedUniqueArray.length;i++) {
            map.put(sortedUniqueArray[i], i+1);
        }

        for(int i=0;i<arr.length;i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}
