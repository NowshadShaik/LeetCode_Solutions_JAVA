package Solutions;

import java.util.List;

public class _3349_Adjacent_Increasing_Subarrays_Detection_I {

    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        int precnt = 0;
        int cnt = 1;
        int res = 0;

        for (int i = 1; i < n; i++) {
            if (nums.get(i) > nums.get(i - 1))
                cnt++;
            else {
                precnt = cnt;
                cnt = 1;
            }

            res = Math.max(res, Math.min(precnt, cnt));
            res = Math.max(res, cnt / 2);
        }

        return res >= k;
    }
}
