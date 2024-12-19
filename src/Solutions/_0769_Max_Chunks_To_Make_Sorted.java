package Solutions;

public class _0769_Max_Chunks_To_Make_Sorted {

    public int maxChunksToSorted(int[] arr) {
        int res = 1;

        int currSum = 0, expectedSum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            currSum += arr[i];
            expectedSum += i;

            if (currSum == expectedSum)
                res++;
        }

        return res;
    }
}
