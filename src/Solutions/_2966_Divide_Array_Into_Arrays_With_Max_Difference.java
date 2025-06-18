package Solutions;

import java.util.Arrays;

public class _2966_Divide_Array_Into_Arrays_With_Max_Difference {

    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] res = new int[nums.length/3][3];

        for(int i=0;i<nums.length/3;i++) {
            int min = nums[i*3];
            int max = nums[(i*3) + 2];

            if((max - min) > k) {
                return new int[0][0];
            } else {
                res[i] = new int[] {nums[i*3], nums[(i*3) + 1], nums[(i*3) + 2]};
            }
        }

        return res;
    }
}
