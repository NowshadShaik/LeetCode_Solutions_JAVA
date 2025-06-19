package Solutions;

import java.util.Arrays;

public class _2294_Partition_Array_Such_That_Maximum_Difference_Is_K {

    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int res = 1;
        int min = nums[0];
        for(int i=1;i<nums.length;i++) {
            if((nums[i] - min) > k) {
                res++;
                min = nums[i];
            }
        }
        return res;
    }

}
