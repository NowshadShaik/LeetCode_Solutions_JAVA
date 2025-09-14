package Solutions;

import java.util.*;

public class _0966_Vowel_Spell_Checker {

    Set<String> correctWords = new HashSet<>();
    Map<String, String> wordsCap = new HashMap<>();
    Map<String, String> wordsVow = new HashMap<>();

    public String[] spellchecker(String[] wordlist, String[] queries) {

        for (String word : wordlist) {
            correctWords.add(word);
            String wordLow = word.toLowerCase();
            wordsCap.putIfAbsent(wordLow, word);
            wordsVow.putIfAbsent(removeVow(wordLow), word);
        }

        String[] res = new String[queries.length];
        int r = 0;
        for (String query : queries)
            res[r++] = solve(query);

        return res;
    }

    private String solve(String query) {
        if (correctWords.contains(query))
            return query;

        String queryLow = query.toLowerCase();
        if (wordsCap.containsKey(queryLow))
            return wordsCap.get(queryLow);

        String queryNoVow = removeVow(queryLow);
        if (wordsVow.containsKey(queryNoVow))
            return wordsVow.get(queryNoVow);

        return "";
    }

    private String removeVow(String word) {
        StringBuilder res = new StringBuilder();

        for (char c : word.toCharArray())
            res.append(isVowel(c) ? "*" : c);

        return res.toString();
    }

    private boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return true;

        return false;
    }
}
