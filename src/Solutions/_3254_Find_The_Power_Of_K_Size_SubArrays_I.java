package Solutions;

public class _3254_Find_The_Power_Of_K_Size_SubArrays_I {

    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int count = 0;

        for(int i=1;i<k;i++) {
            if(nums[i] != nums[i-1]+1) count++;
        }

        int start = 0, end = k-1;
        while(end<n) {
            res[start] = count == 0 ? nums[end] : -1;
            if(start < n-1 && nums[start] != nums[start+1]-1) count--;
            start++;
            if(end<n-1 && nums[end+1] != nums[end]+1) count++;
            end++;
        }

        return res;
    }
}
