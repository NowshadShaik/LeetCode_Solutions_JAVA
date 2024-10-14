package E_Sliding_Window.B_Medium;

public class _1456_Maximum_Number_Of_Vowels_in_Substring_Of_Given_Length {

    public int maxVowels(String s, int k) {
        int res = 0;
        int p1 = 0, p2 = 0;
        while (p2 < k) {
            res += isVowel(s.charAt(p2)) ? 1 : 0;
            p2++;
        }
        int currMax = res;

        while (p2 < s.length()) {
            currMax += isVowel(s.charAt(p2++)) ? 1 : 0;
            currMax -= isVowel(s.charAt(p1++)) ? 1 : 0;
            res = Math.max(res, currMax);
        }

        return res;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
