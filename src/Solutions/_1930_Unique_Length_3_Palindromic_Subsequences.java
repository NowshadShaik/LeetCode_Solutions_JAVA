package Solutions;

import java.util.HashSet;
import java.util.Set;

public class _1930_Unique_Length_3_Palindromic_Subsequences {

    public int countPalindromicSubsequence(String s) {
        int res = 0;

        for (char c = 'a'; c <= 'z'; c++) {
            int start = s.indexOf(c);
            int end = s.lastIndexOf(c);

            if (start != -1 && end != -1 && start < end) {
                Set<Character> set = new HashSet<>();
                for (int i = start + 1; i < end; i++) {
                    set.add(s.charAt(i));
                }

                res += set.size();
            }

        }

        return res;
    }
}
