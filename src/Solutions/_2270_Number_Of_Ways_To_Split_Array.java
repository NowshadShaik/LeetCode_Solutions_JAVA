package Solutions;

public class _2270_Number_Of_Ways_To_Split_Array {

    public int waysToSplitArray(int[] nums) {
        long rightSum = 0;
        for (int n : nums)
            rightSum += n;

        long leftSum = 0;
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            rightSum -= nums[i];

            if (leftSum >= rightSum)
                res++;
        }
        return res;
    }
}
