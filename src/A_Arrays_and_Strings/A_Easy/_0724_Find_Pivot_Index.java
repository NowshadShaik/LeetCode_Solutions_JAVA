package A_Arrays_and_Strings.A_Easy;

public class _0724_Find_Pivot_Index {

    public int pivotIndex(int[] nums) {
        int res = -1;
        int[] tempArr = new int[nums.length];
        int temp = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            tempArr[i] = temp;
            temp += nums[i];
        }

        temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (temp == tempArr[i]) {
                return i;
            } else {
                tempArr[i] = temp;
                temp += nums[i];
            }
        }
        return res;
    }
}
