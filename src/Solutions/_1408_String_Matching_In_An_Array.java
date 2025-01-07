package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _1408_String_Matching_In_An_Array {

    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String word1 = words[i];

            for (int j = 0; j < words.length; j++) {
                if (i != j) {
                    String word2 = words[j];

                    if (word2.indexOf(word1) != -1) {
                        res.add(word1);
                        break;
                    }
                }
            }
        }

        return res;
    }
}
