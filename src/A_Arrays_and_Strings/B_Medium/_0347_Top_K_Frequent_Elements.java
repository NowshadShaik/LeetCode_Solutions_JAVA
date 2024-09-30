package A_Arrays_and_Strings.B_Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _0347_Top_K_Frequent_Elements {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i])) {
                int a = map.get(nums[i]);
                map.put(nums[i], a+1);
            }
            else map.put(nums[i], 1);
        }


        List<Integer>[] bucket = new ArrayList[nums.length+1];
        for(int key : map.keySet()) {
            int freq = map.get(key);
            if(bucket[freq] == null) bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }

        int[] res = new int[k];
        int index = 0;
        for(int i=nums.length;i>=0;i--) {
            if(bucket[i] != null) {
                for(int val : bucket[i]) {
                    res[index++] = val;
                    if(index==k) return res;
                }
            }
        }
        return res;
    }
}
