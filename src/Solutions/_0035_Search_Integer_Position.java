package Solutions;

public class _0035_Search_Integer_Position {
    
    public int searchInsert(int[] nums, int target) {
        
        int l=0,r=nums.length-1;
        while(l<=r) {
            int m = (l + r) / 2;
            if(nums[m] == target) return m;
            else if(nums[m] < target) l = m+1;
            else r = m-1;
        }
        return l;
    }
}
