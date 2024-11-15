package Solutions;

import java.util.Arrays;

public class _0567_Permutation_In_String {

    public boolean checkInclusion(String s1, String s2) {
        int[] arrS1 = new int[26];
        for(char c : s1.toCharArray()) {
            arrS1[c - 'a']++;
        }

        int l=0;
        int count = 0;
        int[] arrS2 = new int[26];

        for(int r=0;r<s2.length();r++) {
            arrS2[s2.charAt(r)-'a']++;
            count++;
            if(count>s1.length()) {
                arrS2[s2.charAt(l)-'a']--;
                l++;
            }
            if(Arrays.equals(arrS1,arrS2)) return true;
        }
        return false;
    }
}
