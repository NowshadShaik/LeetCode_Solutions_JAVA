package Solutions;

public class _3541_Find_Most_Frequent_Vowel_And_Consonant {

    public int maxFreqSum(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray())
            freq[c - 'a']++;

        int maxVow = 0;
        int maxCon = 0;
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                maxVow = Math.max(maxVow, freq[i]);
            else
                maxCon = Math.max(maxCon, freq[i]);
        }

        return maxVow + maxCon;
    }
}
