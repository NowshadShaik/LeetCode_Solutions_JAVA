package B_Two_Pointers.B_Medium;

public class _1813_Sentence_Similarity_III {

    public boolean areSentencesSimilar(String sentence1, String sentence2) {

        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");

        if (words1.length < words2.length) {
            String[] temp = words1;
            words1 = words2;
            words2 = temp;
        }

        int start = 0, end = 0;
        int n1 = words1.length, n2 = words2.length;

        while (start < n2 && words1[start].equals(words2[start])) {
            start++;
        }

        while (end < n2 && words1[n1 - 1 - end].equals(words2[n2 - 1 - end])) {
            end++;
        }

        return start + end >= n2;
    }
}
