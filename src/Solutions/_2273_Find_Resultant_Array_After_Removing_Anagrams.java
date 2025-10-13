package Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2273_Find_Resultant_Array_After_Removing_Anagrams {

    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        res.add(words[0]);

        int[] prev = new int[26];
        for (char c : words[0].toCharArray())
            prev[c - 'a']++;

        for (int i = 1; i < words.length; i++) {

            int[] curr = new int[26];
            for (char c : words[i].toCharArray())
                curr[c - 'a']++;

            if (!Arrays.equals(prev, curr)) {
                prev = curr;
                res.add(words[i]);
            }
        }

        return res;
    }
}
