package Solutions;

import java.util.List;

public class _3350_Adjacent_Increasing_Sub_Arrays_Detection_II {

    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int cnt = 1;
        int precnt = 0;
        int res = 0;

        for (int i = 1; i < n; i++) {

            if (nums.get(i) > nums.get(i - 1)) {
                cnt++;
            } else {
                precnt = cnt;
                cnt = 1;
            }

            res = Math.max(res, Math.min(cnt, precnt));
            res = Math.max(res, cnt / 2);
        }

        return res;
    }
}
