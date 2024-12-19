package Solutions;

import java.util.HashSet;
import java.util.Set;

public class _2442_Count_Number_Of_Distinct_Integers_After_Reverse_Operations {

    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);

            int rev = 0;
            while (num != 0) {
                rev = (rev * 10) + (num % 10);
                num /= 10;
            }
            set.add(rev);
        }

        return set.size();
    }
}
