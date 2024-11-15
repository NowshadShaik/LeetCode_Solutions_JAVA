package Solutions;

public class _1768_Merge_Strings_Alternately {
    
    class Solution {
        public String mergeAlternately(String word1, String word2) {
            int l1=word1.length(), l2=word2.length();
            StringBuilder result = new StringBuilder();
            for(int i=0; i< l1 || i<l2; i++) {
                if(i<l1) {
                    result.append(word1.charAt(i));
                }
                if(i<l2) {
                    result.append(word2.charAt(i));
                }
            }
            return result.toString();
        }
    }
}
