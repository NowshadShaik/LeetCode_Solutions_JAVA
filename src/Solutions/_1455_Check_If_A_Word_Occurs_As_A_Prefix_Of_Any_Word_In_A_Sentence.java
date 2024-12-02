package Solutions;

public class _1455_Check_If_A_Word_Occurs_As_A_Prefix_Of_Any_Word_In_A_Sentence {

    public int isPrefixOfWord(String sentence, String searchWord) {
        int res = -1;
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                res = i + 1;
                break;
            }
        }
        return res;
    }
}
