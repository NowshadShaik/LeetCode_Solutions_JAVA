package Solutions;

import java.util.ArrayList;
import java.util.List;

class _0212_Word_Search_II {
    List<String> res = new ArrayList<>();

    public List<String> findWords(char[][] board, String[] words) {
        TrieNode2 root = new TrieNode2();

        for(int i=0;i<words.length;i++)
            root.addWord(words[i], i);

        for(int r=0;r<board.length;r++) {
            for(int c=0;c<board[0].length;c++) {
                dfs(board, root, r, c, words);
            }
        }

        return res;
    }

    private void dfs(char[][] board, TrieNode2 node, int r, int c, String[] words) {

        if(r<0 || c<0 || r>=board.length || c>=board[0].length || board[r][c] == '*'
                || node.children[board[r][c] - 'a'] == null) {
            return;
        }

        char temp = board[r][c];
        board[r][c] = '*';
        TrieNode2 prev = node;
        node = node.children[temp - 'a'];

        if(node.idx != -1) {
            res.add(words[node.idx]);
            node.idx = -1;
            node.refs--;
            if(node.refs == 0) {
                node = null;
                prev.children[temp - 'a'] = null;
                board[r][c] = temp;
                return;
            }
        }

        dfs(board, node, r+1, c, words);
        dfs(board, node, r-1, c, words);
        dfs(board, node, r, c+1, words);
        dfs(board, node, r, c-1, words);

        board[r][c] = temp;
    }
}


class TrieNode2 {
    TrieNode2[] children = new TrieNode2[26];
    int idx = -1;
    int refs = 0;

    public void addWord(String word, int i) {
        TrieNode2 cur = this;
        cur.refs++;
        for(char c : word.toCharArray()) {
            int index = c - 'a';
            if(cur.children[index] == null) {
                cur.children[index] = new TrieNode2();
            }

            cur = cur.children[index];
            cur.refs++;
        }
        cur.idx = i;
    }
}