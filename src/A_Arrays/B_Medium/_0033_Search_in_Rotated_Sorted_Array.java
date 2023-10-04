package A_Arrays.B_Medium;

public class _0033_Search_in_Rotated_Sorted_Array {

    class Solution {
        public int search(int[] nums, int target) {
            int left = 0, right = nums.length-1;

            while(left<=right) {
                int mid = (left+right)/2;
                if(nums[mid] == target) {
                    return mid;
                }

                // Check if we are in left portion
                if (nums[mid]>=nums[left]) {
                    if(target>nums[mid] || target<nums[left]) {
                        left = mid+1;
                    } else {
                        right = mid-1;
                    }
                }
                // it means we are in right portion
                else {
                    if(target<nums[mid] || target>nums[right]) {
                        right = mid-1;
                    } else {
                        left =  mid+1;
                    }

                }
            }
            return -1;
        }
    }
}
