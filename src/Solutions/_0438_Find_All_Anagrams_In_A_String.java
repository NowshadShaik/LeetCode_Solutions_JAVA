package Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0438_Find_All_Anagrams_In_A_String {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(p.length() > s.length()) return res;

        int[] target = new int[26];
        int[] curr = new int[26];

        int l = 0, r = 0;
        for(r=0;r<p.length();r++) {
            target[p.charAt(r) - 'a']++;
            curr[s.charAt(r) - 'a']++;
        }
        if(Arrays.equals(target, curr)) res.add(l);

        while(r<s.length()) {
            curr[s.charAt(r) - 'a']++;
            curr[s.charAt(l) - 'a']--;
            r++;
            l++;
            if(Arrays.equals(target, curr)) res.add(l);
        }
        return res;
    }
}
