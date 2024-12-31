package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _0068_Text_Justification {

    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        List<String> currWords = new ArrayList<>();

        int currLen = 0;
        for (int w = 0; w < words.length; w++) {
            String word = words[w];
            if (currLen + currWords.size() + word.length() > maxWidth) {
                int totalSpaces = maxWidth - currLen;
                int gaps = currWords.size() - 1;
                if (gaps == 0)
                    res.add(currWords.get(0) + " ".repeat(totalSpaces));
                else {
                    int spacePerGap = totalSpaces / gaps;
                    int extraSpaces = totalSpaces % gaps;
                    StringBuilder line = new StringBuilder();
                    for (int i = 0; i < currWords.size(); i++) {
                        line.append(currWords.get(i));
                        if (i < gaps) {
                            line.append(" ".repeat(spacePerGap));
                            if (i < extraSpaces)
                                line.append(' ');
                        }
                    }
                    res.add(line.toString());
                }
                currWords.clear();
                currLen = 0;
            }
            currWords.add(word);
            currLen += word.length();
        }

        StringBuilder lastLine = new StringBuilder(String.join(" ", currWords));
        while (lastLine.length() < maxWidth)
            lastLine.append(' ');

        res.add(lastLine.toString());
        return res;
    }
}
