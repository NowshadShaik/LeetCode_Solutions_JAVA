package Solutions;

import java.util.HashSet;
import java.util.Set;

public class _0128_Longest_Consecutive_Sequence {

        public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        
        int max = 1;
        Set<Integer> set = new HashSet<>();
        for(int n : nums) set.add(n);

        for(int n : nums) {
            int tempMax = 1, x=n;
            if(!set.contains(x+1)) {
                while(set.contains(x-1)) {
                    tempMax++;
                    x--;
                }
                max = Math.max(tempMax, max);
                if(max>(nums.length/2)) {
                    return max;
                }
            }
        }
        return max;
    }
}