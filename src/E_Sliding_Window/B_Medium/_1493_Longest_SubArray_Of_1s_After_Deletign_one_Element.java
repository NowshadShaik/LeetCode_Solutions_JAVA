package E_Sliding_Window.B_Medium;

public class _1493_Longest_SubArray_Of_1s_After_Deletign_one_Element {

    public int longestSubarray(int[] nums) {
        int p1 = 0, p2 = 0;
        int res = 0;
        int curr = 0;
        boolean delete = false;
        while (p2 < nums.length) {
            if (nums[p2] == 1) {
                curr++;
            } else if (nums[p2] == 0 && !delete) {
                curr++;
                delete = true;
            } else {
                while (nums[p1] != 0) {
                    p1++;
                    curr--;
                }
                p1++;
            }

            p2++;
            res = Math.max(curr - 1, res);
        }
        return res;
    }
}
