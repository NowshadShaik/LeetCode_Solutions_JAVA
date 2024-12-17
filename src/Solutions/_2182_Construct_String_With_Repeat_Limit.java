package Solutions;

import java.util.PriorityQueue;

public class _2182_Construct_String_With_Repeat_Limit {

    public String repeatLimitedString(String s, int repeatLimit) {
        StringBuilder result = new StringBuilder();

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        PriorityQueue<Pair<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getKey() - (a.getKey()));

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                pq.offer(new Pair<>((char) (i + 97), freq[i]));
            }
        }

        while (!pq.isEmpty()) {
            Pair<Character, Integer> curr = pq.poll();
            int min = Math.min(curr.getValue(), repeatLimit);
            for (int i = 0; i < min; i++)
                result.append(curr.getKey());

            if (curr.getValue() - min > 0 && !pq.isEmpty()) {
                Pair<Character, Integer> next = pq.poll();
                result.append(next.getKey());

                if (next.getValue() - 1 > 0) {
                    pq.offer(new Pair<>(next.getKey(), next.getValue() - 1));
                }

                pq.offer(new Pair<>(curr.getKey(), curr.getValue() - min));

            }
        }

        return result.toString();
    }
}
