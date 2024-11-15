package Solutions;

public class _1574_Shortest_Subarray_To_Be_Removed_To_Make_Array_Sorted {

    public int findLengthOfShortestSubarray(int[] arr) {
        int r = arr.length - 1;
        while (r > 0 && arr[r] >= arr[r - 1]) r--;

        int res = r;
        int l = 0;
        while (l < r && (l == 0 || arr[l - 1] <= arr[l])) {
            while (r < arr.length && arr[l] > arr[r]) {
                r++;
            }
            res = Math.min(res, r - l - 1);
            l++;
        }

        return res;
    }
}
