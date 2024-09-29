package E_Sliding_Window.A_Easy;

public class _0643_Maximum_Average_Subarray {

    public double findMaxAverage(int[] nums, int k) {
        int l = 0, r = k - 1;
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double avg = sum / k;
        r = k;
        while (r < nums.length) {
            sum -= nums[l++];
            sum += nums[r++];
            avg = Math.max(avg, sum / k);
        }
        return avg;
    }
}
