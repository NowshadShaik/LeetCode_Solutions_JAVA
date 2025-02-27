package Solutions;

public class _0238_Product_of_Array_Except_Self {

    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int ans[] = new int[nums.length];
            int prefix = 1;
            for(int i=0;i<nums.length;i++) {
                ans[i] = prefix;
                prefix *= nums[i];
            }
            int postfix = 1;
            for(int i=nums.length-1;i>=0;i--) {
                ans[i] = postfix * ans[i];
                postfix *= nums[i];
            }
            return ans;
        }
    }
}
