package H_Recursion.B_Medium;

import java.util.HashSet;

public class _1593_Split_A_String_Into_Unique_Number_Of_Substrings {

    public int maxUniqueSplit(String s) {
        return backTrack(s, 0, new HashSet<>());
    }

    private int backTrack(String s, int start, HashSet<String> seen) {
        if (s.length() == start) return 0;

        int maxSplits = 0;
        for (int end = start + 1; end <= s.length(); end++) {
            String subStr = s.substring(start, end);
            if (!seen.contains(subStr)) {
                seen.add(subStr);
                maxSplits = Math.max(maxSplits, 1 + backTrack(s, end, seen));
                seen.remove(subStr);
            }
        }
        return maxSplits;
    }
}
