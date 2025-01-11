package Solutions;

public class _0208_Implement_Trie {

    TrieNode root;

    public _0208_Implement_Trie() {
        this.root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;

        for(char c : word.toCharArray()) {
            if(node.children[c - 'a'] == null)
                node.children[c - 'a'] = new TrieNode();

            node = node.children[c - 'a'];
        }

        node.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode node = root;

        for(char c : word.toCharArray()) {
            if(node.children[c - 'a'] == null)
                return false;

            node = node.children[c - 'a'];
        }

        return node.isEnd;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;

        for(char c : prefix.toCharArray()) {
            if(node.children[c - 'a'] == null)
                return false;

            node = node.children[c - 'a'];
        }

        return true;
    }
}
