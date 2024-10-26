package A_Arrays_and_Strings.B_Medium;

import java.util.ArrayList;
import java.util.List;

public class _3324_Find_The_Sequence_Of_Strings_Appeared_On_Screen {

    public List<String> stringSequence(String target) {
        StringBuilder str = new StringBuilder();
        List<String> res = new ArrayList<>();

        for(char ch : target.toCharArray()) {
            char curr = ch;
            str.append(curr);
            for(char c = 'a'; c <= curr; c++) {
                str.setCharAt(str.length()-1, c);
                res.add(str.toString());
            }
        }
        return res;
    }
}
