package Solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _0140_Word_Break_II {

    List<String> res = new ArrayList<>();
    Set<String> dict = new HashSet<>();

    public List<String> wordBreak(String s, List<String> wordDict) {
        dict = new HashSet<>(wordDict);

        backtrack(s, 0, new ArrayList<>());
        return res;
    }

    private void backtrack(String s, int i, List<String> curr) {
        if (i == s.length()) {
            res.add(String.join(" ", curr));
            return;
        }

        for (int j = i; j < s.length(); j++) {
            String word = s.substring(i, j + 1);
            if (dict.contains(word)) {
                curr.add(word);
                backtrack(s, j + 1, curr);
                curr.remove(curr.size() - 1);
            }
        }
    }
}
