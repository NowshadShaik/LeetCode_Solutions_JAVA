package Solutions;

public class _0211_Design_Add_And_Search_Words_Data_Structure {


    private TrieNode1 dictionary;

    public _0211_Design_Add_And_Search_Words_Data_Structure() {
        this.dictionary = new TrieNode1();
    }

    public void addWord(String word) {
        TrieNode1 curr = dictionary;
        for (char c : word.toCharArray()) {
            if (curr.children[c - 'a'] == null) {
                curr.children[c - 'a'] = new TrieNode1();
            }
            curr = curr.children[c - 'a'];
        }
        curr.word = true;
    }

    public boolean search(String word) {
        return dfs(word, 0, dictionary);
    }

    private boolean dfs(String word, int j, TrieNode1 node) {
        TrieNode1 curr = node;
        for (int i = j; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == '.') {
                for (TrieNode1 child : curr.children) {
                    if (child != null && dfs(word, i + 1, child)) {
                        return true;
                    }
                }
                return false;
            } else {
                if (curr.children[c - 'a'] == null)
                    return false;
                curr = curr.children[c - 'a'];
            }
        }
        return curr.word;
    }
}

class TrieNode1 {

    TrieNode1[] children;
    boolean word;

    public TrieNode1() {
        this.children = new TrieNode1[26];
        this.word = false;
    }
}