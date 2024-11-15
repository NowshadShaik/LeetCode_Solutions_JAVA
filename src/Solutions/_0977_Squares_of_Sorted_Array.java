package Solutions;

public class _0977_Squares_of_Sorted_Array {

    public int[] sortedSquares(int[] nums) {
        int l = nums.length-1;
        int[] ans = new int[l+1];
        int p1 = 0, p2 = l;

        while(p1<=p2) {
            int a = Math.abs(nums[p1] * nums[p1]);
            int b = Math.abs(nums[p2] * nums[p2]);
            ans[l--] = Math.max(a,b);
            if(a>b) p1++;
            else p2--;
        }
        return ans;
    }
}