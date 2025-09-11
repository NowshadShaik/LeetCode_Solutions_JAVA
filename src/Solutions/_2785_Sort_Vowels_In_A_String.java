package Solutions;

import java.util.PriorityQueue;

public class _2785_Sort_Vowels_In_A_String {

    public String sortVowels(String s) {
        PriorityQueue<Character> minHeap = new PriorityQueue<>();
        char[] str = s.toCharArray();

        for (char c : str)
            if (isVowel(c))
                minHeap.offer(c);

        for (int i = 0; i < str.length; i++) {
            if (isVowel(str[i]))
                str[i] = minHeap.poll();
        }

        return new String(str);
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
