package A_Arrays.A_Easy;

public class _0560_Subarray_Sum_Equals_K {
    
    class Solution {
        public int subarraySum(int[] nums, int k) {
            int ans = 0;
    
            for(int i=0;i<nums.length;i++) {
                int sum=0;
                for(int j=i;j<nums.length;j++){
                    sum=sum+nums[j];
                    if(sum==k){
                        ans++;
                    }
                }
            }
            return ans;
        }
    }
}
