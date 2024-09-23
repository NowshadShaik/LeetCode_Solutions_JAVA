package A_Arrays_&_Strings.A_Easy;


public class _0242_Valid_Anagrams {

    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;
    
            int[] values = new int[26];
    
            for(int i=0;i<s.length();i++) {
                values[s.charAt(i)-97]++;
                values[t.charAt(i)-97]--;
            }
    
            for(int n:values) {
                if(n!=0) return false;
            }
            return true;
        }
    }
}