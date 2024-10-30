package A_Arrays_and_Strings.C_Hard;

import java.util.Arrays;

public class _1671_Minimum_Number_Of_Removals_To_Make_Mountain_Array {

    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] LIS = new int[nums.length], LDS = new int[nums.length];
        Arrays.fill(LIS, 1);
        Arrays.fill(LDS, 1);

        for(int i=0;i<n;i++) {
            for(int j=0;j<i;j++) {
                if(nums[i] > nums[j]) {
                    LIS[i] = Math.max(LIS[i], LIS[j] + 1);
                }
            }
        }

        for(int i = n-1;i>=0; i--) {
            for(int j = n-1; j>i;j--) {
                if(nums[i] > nums[j]) {
                    LDS[i] = Math.max(LDS[i], LDS[j]+1);
                }
            }
        }

        int maxMountainLength = 0;

        for(int i = 1;i<n-1;i++) {
            if(LIS[i] > 1 && LDS[i] > 1) {
                maxMountainLength = Math.max(maxMountainLength, LIS[i]+LDS[i]-1);
            }
        }

        return n - maxMountainLength;
    }
}
