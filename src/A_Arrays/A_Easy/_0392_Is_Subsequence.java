package A_Arrays.A_Easy;

public class _0392_Is_Subsequence {
    
    class Solution {
        public boolean isSubsequence(String s, String t) {
            int p1 = 0, p2 = 0;
            int l1 = s.length(), l2 = t.length();
            if(l1==0) return true;
            if(l1>0 && l2==0) return false;
    
            while(p1<l1 && p2<l2) {
                if(s.charAt(p1) == t.charAt(p2)) {
                    if(p1==l1-1) return true;
                    p1++;
                    p2++;
                } else {
                    p2++;
                }
            }
    
            return false;
        }
    }
}