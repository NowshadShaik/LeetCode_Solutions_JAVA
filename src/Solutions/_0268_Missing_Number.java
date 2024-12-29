package Solutions;

public class _0268_Missing_Number {
    public int missingNumber(int[] nums) {

        int n = nums.length;
        int required = (n * (n + 1) / 2);

        int actual = 0;
        for (int num : nums)
            actual += num;

        return required - actual;
    }
}
