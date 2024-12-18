package Solutions;

import java.util.List;

public class _0648_Replace_Words {

    public String replaceWords(List<String> dictionary, String sentence) {
        Trie trie = new Trie();
        trie.build(dictionary);

        String[] words = sentence.split(" ");

        StringBuilder res = new StringBuilder();
        for (String word : words) {
            res.append(trie.prefix(word)).append(" ");
        }

        return res.substring(0, res.length() - 1);
    }

    static class TrieNode {
        char c;
        boolean isEnd = false;
        TrieNode[] children = new TrieNode[26];

        public TrieNode(char c) {
            this.c = c;
        }
    }

    static class Trie {
        TrieNode root = new TrieNode('-');

        public void build(List<String> dict) {
            for (String s : dict) {
                add(s);
            }
        }

        private void add(String s) {
            TrieNode[] sub = root.children;

            for (int i = 0; i < s.length(); i++) {
                int idx = s.charAt(i) - 'a';

                if (sub[idx] == null) {
                    sub[idx] = new TrieNode(s.charAt(i));
                }

                if (i == s.length() - 1) {
                    sub[idx].isEnd = true;
                }

                sub = sub[idx].children;
            }
        }

        public String prefix(String s) {
            TrieNode[] sub = root.children;

            for (int i = 0; i < s.length(); i++) {
                int idx = s.charAt(i) - 'a';

                if (sub[idx] == null) {
                    break;
                }

                if (sub[idx].isEnd) {
                    return s.substring(0, i + 1);
                }

                sub = sub[idx].children;
            }
            return s;
        }
    }
}
