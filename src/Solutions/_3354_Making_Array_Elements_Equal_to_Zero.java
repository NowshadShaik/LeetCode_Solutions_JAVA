package Solutions;

public class _3354_Making_Array_Elements_Equal_to_Zero {

    public int countValidSelections(int[] nums) {
        int res = 0;

        int right = 0;
        for(int n: nums)
            right += n;

        int left = 0;
        for(int n: nums) {

            if(n == 0) {
                if(left-right >= 0 && left-right <= 1)
                    res++;

                if(right-left >= 0 && right-left <= 1)
                    res++;
            }

            left += n;
            right -= n;
        }

        return res;
    }
}
