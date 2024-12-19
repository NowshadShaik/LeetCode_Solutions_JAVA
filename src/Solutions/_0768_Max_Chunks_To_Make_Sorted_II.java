package Solutions;

public class _0768_Max_Chunks_To_Make_Sorted_II {

    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;

        int[] min = new int[n];
        min[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            min[i] = Math.min(arr[i], min[i + 1]);
        }

        int res = 1;
        int max = arr[0];

        for (int i = 0; i < n - 1; i++) {
            if (max <= min[i + 1]) {
                res++;
            }
            max = Math.max(max, arr[i + 1]);
        }

        return res;
    }
}
