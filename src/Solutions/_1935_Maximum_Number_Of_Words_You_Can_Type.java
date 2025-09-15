package Solutions;

import java.util.HashSet;
import java.util.Set;

public class _1935_Maximum_Number_Of_Words_You_Can_Type {

    public int canBeTypedWords(String text, String brokenLetters) {
        if (brokenLetters.length() == 26)
            return 0;

        Set<Character> broken = new HashSet<>();
        for (char c : brokenLetters.toCharArray())
            broken.add(c);

        int res = 0;
        String[] words = text.split(" ");

        for (String word : words) {

            boolean canType = true;
            for (char c : word.toCharArray()) {
                if (broken.contains(c)) {
                    canType = false;
                    break;
                }
            }

            if (canType)
                res++;
        }

        return res;
    }
}
