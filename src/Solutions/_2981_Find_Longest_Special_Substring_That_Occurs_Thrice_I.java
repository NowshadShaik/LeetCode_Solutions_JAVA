package Solutions;

public class _2981_Find_Longest_Special_Substring_That_Occurs_Thrice_I {

    public int maximumLength(String s) {
        int n = s.length();
        int l = 1, r = n;

        if (!helper(s, l, n)) return -1;

        while (l + 1 < r) {
            int mid = (l + r) / 2;

            if (helper(s, mid, n)) l = mid;
            else r = mid;
        }
        return l;
    }

    private boolean helper(String s, int c, int n) {
        int[] count = new int[26];
        int p = 0;

        for (int i = 0; i < n; i++) {
            while (s.charAt(p) != s.charAt(i)) p++;

            if (i - p + 1 >= c) count[s.charAt(i) - 'a']++;
            if (count[s.charAt(i) - 'a'] > 2) return true;
        }

        return false;
    }
}
