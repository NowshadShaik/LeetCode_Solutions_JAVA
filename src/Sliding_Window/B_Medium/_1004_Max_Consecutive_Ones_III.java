package Sliding_Window.B_Medium;

public class _1004_Max_Consecutive_Ones_III {

    public int longestOnes(int[] nums, int k) {

        int l=0;
        int currZero = 0;
        int longest = 0;
        for(int r=0;r<nums.length;r++) {
            if(nums[r]==0 & currZero == k) {
                while(nums[l] !=0) {
                    l++;
                }
                l++;
            } else if(nums[r] == 0 && currZero<k) {
                currZero++;
            }
            longest = Math.max(longest, r-l+1);
        }
        return longest;
    }
}
