package Solutions;

import java.util.*;

public class _0018_Four_Sum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;

        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<length-3;i++) {
            if(i > 0 && nums[i] == nums[i-1])
                continue;

            for(int j=i+1;j<length-2;j++) {
                if(j > i+1 && nums[j] == nums[j-1])
                    continue;

                int l = j+1, r = length-1;
                while(l<r) {
                    long curr = nums[i] + nums[j];
                    curr += nums[l] + nums[r];
                    if(curr == target) {
                        res.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[l], nums[r])));
                        l++;
                        r--;

                        while(l<r && nums[l-1] == nums[l]) l++;
                        while(l<r && nums[r+1] == nums[r]) r--;
                    }
                    else if(curr < target) l++;
                    else r--;
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 0, -1, 0, -2, 2};
        int target = 0;
        fourSum(arr, target);
    }
}

