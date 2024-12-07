package Solutions;

public class _1760_Minimum_Limit_Of_Balls_In_A_Bag {

    public int minimumSize(int[] nums, int maxOperations) {

        int l = 1;
        int r = 0;
        for (int n : nums) r = Math.max(n, r);

        while (l < r) {
            int mid = (l + r) / 2;

            if (isPossible(mid, nums, maxOperations)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private boolean isPossible(int max, int[] nums, int maxOperations) {

        for (int n : nums) {
            maxOperations -= (n - 1) / max;

            if (maxOperations < 0) return false;
        }

        return true;
    }
}
