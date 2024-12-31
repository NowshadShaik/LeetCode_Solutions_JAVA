package Solutions;

public class _1255_Maximum_Score_Words_Formed_By_Letters {

    private int maxScore;
    private int[] freq;

    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int w = words.length;

        freq = new int[26];
        for (char c : letters)
            freq[c - 'a']++;

        maxScore = 0;
        check(w - 1, words, score, new int[26], 0);
        return maxScore;
    }

    private void check(int w, String[] words, int[] score, int[] subsetLetters, int totalScore) {
        if (w == -1) {
            maxScore = Math.max(maxScore, totalScore);
            return;
        }

        check(w - 1, words, score, subsetLetters, totalScore);

        int l = words[w].length();
        for (int i = 0; i < l; i++) {
            int c = words[w].charAt(i) - 'a';
            subsetLetters[c]++;
            totalScore += score[c];
        }

        if (isValidWord(subsetLetters)) {
            check(w - 1, words, score, subsetLetters, totalScore);
        }

        for (int i = 0; i < l; i++) {
            int c = words[w].charAt(i) - 'a';
            subsetLetters[c]--;
            totalScore -= score[c];
        }
    }

    private boolean isValidWord(int[] subsetLetters) {
        for (int c = 0; c < 26; c++) {
            if (freq[c] < subsetLetters[c]) {
                return false;
            }
        }

        return true;
    }
}
