package Solutions;

import java.util.HashSet;
import java.util.Set;

public class _2657_Find_The_Prefix_Common_Array_Of_Two_Arrays {

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> unique = new HashSet<>();
        int[] res = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            unique.add(A[i]);
            unique.add(B[i]);

            int exp = (i + 1) * 2;
            int act = unique.size();

            res[i] = exp - act;
        }

        return res;
    }
}
