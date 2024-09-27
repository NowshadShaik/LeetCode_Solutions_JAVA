package D_Binary_Search.A_Easy;

public class _0704_Binary_Search {

    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int m = start + ((end - start) / 2);
            int mid = nums[m];
            if (target == mid)
                return m;
            else if (target > mid)
                start = m + 1;
            else
                end = m - 1;
        }
        return -1;
    }
}
