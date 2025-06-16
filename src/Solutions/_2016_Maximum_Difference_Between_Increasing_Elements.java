package Solutions;

public class _2016_Maximum_Difference_Between_Increasing_Elements {

    public int maximumDifference(int[] nums) {
        int res = -1;
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) {
                int curr = nums[i] - min;
                res = Math.max(res, curr);
            } else
                min = nums[i];
        }

        return res;
    }

}
