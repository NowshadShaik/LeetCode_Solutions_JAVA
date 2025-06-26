package Solutions;

public class _2311_Longest_Binary_Subsequence_Less_Than_or_Equal_to_K {

    public int longestSubsequence(String s, int k) {
        int sum = 0;
        int count = 0;
        int bits = (int) (Math.log(k) / Math.log(2)) + 1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(s.length() - 1 - i);
            if (ch == '1') {
                if ((sum + (1 << i) <= k) && (i < bits)) {
                    sum += 1 << i;
                    count++;
                }
            } else
                count++;
        }

        return count;
    }
}
