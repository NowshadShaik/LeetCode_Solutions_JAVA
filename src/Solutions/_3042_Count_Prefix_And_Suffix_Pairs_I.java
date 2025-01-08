package Solutions;

public class _3042_Count_Prefix_And_Suffix_Pairs_I {

    public int countPrefixSuffixPairs(String[] words) {
        int res = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j]))
                    res++;
            }
        }
        return res;
    }

    private boolean isPrefixAndSuffix(String s1, String s2) {
        if (s2.length() < s1.length()) return false;
        return s2.startsWith(s1) && s2.endsWith(s1);
    }
}
