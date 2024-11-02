package A_Arrays_and_Strings.A_Easy;

public class _2490_Circular_Sentence {

    public boolean isCircularSentence(String sentence) {
        boolean res = true;

        if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1)) res = false;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                if (sentence.charAt(i - 1) != sentence.charAt(i + 1)) res = false;
            }
        }

        return res;
    }
}
