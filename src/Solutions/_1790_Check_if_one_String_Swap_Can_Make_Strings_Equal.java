package Solutions;

public class _1790_Check_if_one_String_Swap_Can_Make_Strings_Equal {

    public boolean areAlmostEqual(String s1, String s2) {
        int diff = 0;
        int[] freq = new int[26];

        for(int i=0;i<s1.length();i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
            if(s1.charAt(i) != s2.charAt(i))
                diff++;
        }

        for(int i : freq)
            if(i != 0)
                return false;

        return (diff == 0 || diff == 2) ? true : false;
    }
}
