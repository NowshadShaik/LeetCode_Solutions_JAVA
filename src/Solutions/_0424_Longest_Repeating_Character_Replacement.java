package Solutions;

public class _0424_Longest_Repeating_Character_Replacement {

    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int l=0;
        int max = 0;
        int longest = 0;

        for(int r=0;r<s.length();r++) {
            arr[s.charAt(r) - 'A']++;
            max = Math.max(max, arr[s.charAt(r) - 'A']);

            if(r-l+1-max > k) {
                arr[s.charAt(l) - 'A']--;
                l++;
            }
            longest = Math.max(longest, r-l+1);
        }
        return longest;
    }
}
