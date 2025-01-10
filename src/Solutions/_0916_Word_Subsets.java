package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _0916_Word_Subsets {

    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res = new ArrayList<>();

        int[] maxFreq = new int[26];
        for (String word2 : words2) {
            int[] curr = new int[26];
            for (char c : word2.toCharArray())
                curr[c - 'a']++;

            for (int i = 0; i < 26; i++)
                maxFreq[i] = Math.max(curr[i], maxFreq[i]);
        }

        for (String word1 : words1) {
            int[] curr = new int[26];
            for (char c : word1.toCharArray())
                curr[c - 'a']++;

            boolean isUniversal = true;
            for (int i = 0; i < 26; i++) {
                if (curr[i] < maxFreq[i]) {
                    isUniversal = false;
                    break;
                }
            }

            if (isUniversal)
                res.add(word1);
        }

        return res;
    }
}
