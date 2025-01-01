package Solutions;

public class _0912_Sort_An_Array {

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int l, int r) {
        if (l >= r) return;

        int m = (l + r) / 2;
        mergeSort(nums, l, m);
        mergeSort(nums, m + 1, r);

        merge(nums, l, m, r);
    }

    private void merge(int[] nums, int l, int m, int r) {
        int[] temp = new int[r - l + 1];
        int idx = 0;

        int i = l, j = m + 1;

        while (i <= m && j <= r) {
            if (nums[i] < nums[j])
                temp[idx++] = nums[i++];
            else
                temp[idx++] = nums[j++];
        }

        while (i <= m)
            temp[idx++] = nums[i++];

        while (j <= r)
            temp[idx++] = nums[j++];

        System.arraycopy(temp, 0, nums, l, temp.length);
    }
}
