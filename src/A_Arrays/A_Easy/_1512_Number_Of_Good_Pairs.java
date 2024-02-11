package A_Arrays.A_Easy;

import java.util.HashMap;
import java.util.Map;

class _1512_Number_Of_Good_Pairs {

    class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        Map<Integer,Integer> values = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            int val = nums[i];
            if(values.containsKey(val)) {
                int a = values.get(val);
                ans += a;
                values.put(val,a+=1);
            } else {
                values.put(val,1);
            }
        }
        
        return ans;
    }
}
}