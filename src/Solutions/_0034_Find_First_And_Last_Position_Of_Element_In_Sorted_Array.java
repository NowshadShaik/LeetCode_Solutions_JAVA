package Solutions;

public class _0034_Find_First_And_Last_Position_Of_Element_In_Sorted_Array {

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[] {-1, -1};
        if(nums.length == 0) return res;
        int first = -1, last = -1;

        int l=0, r = nums.length-1;
        while(l<=r) {
            int m = l+(r-l)/2;
            if(nums[m] == target) {
                first = m;
                r = m-1;
            }
            else if(nums[m] < target)
                l = m+1;
            else
                r = m-1;
        }

        l=0;
        r = nums.length-1;
        while(l<=r) {
            int m = l+(r-l)/2;
            if(nums[m] == target) {
                last = m;
                l = m+1;
            }
            else if(nums[m] < target)
                l = m+1;
            else
                r = m-1;
        }

        return new int[] {first, last};
    }
}
