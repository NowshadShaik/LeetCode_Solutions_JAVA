package A_Arrays_and_Strings.A_Easy;

import java.util.HashSet;
import java.util.Set;

public class _0345_Reverse_Vowels_Of_A_String {

    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int p1 = 0, p2 = s.length() - 1;
        char[] str = s.toCharArray();
        while (p1 < p2) {
            while (p1 < p2 && !set.contains(str[p1]))
                p1++;
            while (p1 < p2 && !set.contains(str[p2]))
                p2--;

            char c = str[p1];
            str[p1] = str[p2];
            str[p2] = c;
            p1++;
            p2--;
        }
        return new String(str);
    }
}
