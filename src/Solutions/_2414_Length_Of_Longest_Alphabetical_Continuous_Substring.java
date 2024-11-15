package Solutions;

public class _2414_Length_Of_Longest_Alphabetical_Continuous_Substring {

    public int longestContinuousSubstring(String s) {
        int longest = 1;
        int tempMax = 1;
        for(int i=1;i<s.length();i++) {
            if(s.charAt(i) == (char)s.charAt(i-1) + 1) {
                tempMax++;
            }
            else {
                tempMax = 1;
            }
            longest = Math.max(longest, tempMax);
        }
        return longest;
    }
}
