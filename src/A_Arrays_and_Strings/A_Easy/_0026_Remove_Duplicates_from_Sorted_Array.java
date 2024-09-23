package A_Arrays_and_Strings.A_Easy;

public class _0026_Remove_Duplicates_from_Sorted_Array {

    class Solution {
        public int removeDuplicates(int[] nums) {
            if(nums.length==0) return 0;
            int ans = 1;
            for(int i=0;i<nums.length-1;i++) {
                if(nums[i]!=nums[i+1]) {
                    nums[ans]=nums[i+1];
                    ans++;
                }
            }
            return ans;
        }
    }
}
