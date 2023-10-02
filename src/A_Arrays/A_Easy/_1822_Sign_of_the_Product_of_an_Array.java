package A_Arrays.A_Easy;

public class _1822_Sign_of_the_Product_of_an_Array {

    class Solution {
        public int arraySign(int[] nums) {
            int n = 0;
            for(int i=0;i<nums.length;i++) {
                if(nums[i]==0) {
                    return 0;
                } else if (nums[i]<0) {
                    n++;
                }
            }
            return n%2==0 ? 1 : -1;
        }
    }
}
