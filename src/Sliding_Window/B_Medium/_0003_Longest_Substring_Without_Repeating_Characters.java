package Sliding_Window.B_Medium;

import java.util.HashSet;
import java.util.Set;

public class _0003_Longest_Substring_Without_Repeating_Characters {
    
        public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l=0, res=0;

        for(int r=0;r<s.length();r++) {
            while(set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            res = Math.max(res, r-l+1);
        }
        return res;
        
    }
    
}
