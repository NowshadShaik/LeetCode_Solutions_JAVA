package Solutions;

public class _3432_Count_Partitions_With_Even_Sum_Difference {

    public int countPartitions(int[] nums) {

        int evenSumPartitions = 0;
        int totalSum = 0;

        for (int n : nums)
            totalSum += n;

        int leftSum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            int rightSum = totalSum - leftSum;

            if ((leftSum - rightSum) % 2 == 0)
                evenSumPartitions++;
        }

        return evenSumPartitions;
    }
}
