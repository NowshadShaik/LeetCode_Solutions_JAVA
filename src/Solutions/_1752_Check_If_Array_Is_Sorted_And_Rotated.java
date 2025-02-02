package Solutions;

import java.util.Arrays;

public class _1752_Check_If_Array_Is_Sorted_And_Rotated {

    public boolean check(int[] nums) {
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1])
                count++;
        }

        if (nums[nums.length - 1] > nums[0])
            count++;

        return count <= 1;
    }
}
