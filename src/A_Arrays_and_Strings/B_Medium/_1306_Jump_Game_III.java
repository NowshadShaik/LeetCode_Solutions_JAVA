package A_Arrays_and_Strings.B_Medium;

public class _1306_Jump_Game_III {

    class Solution {
        public boolean canReach(int[] arr, int start) {
            boolean[] visited= new boolean[arr.length];
            return DFS(arr, start, visited);
        }

        private boolean DFS(int[] arr, int curr, boolean[] visited) {
            if(curr<0 || curr>=arr.length || visited[curr] == true) return false;
            if(arr[curr] == 0) return true;
            visited[curr] = true;
            return DFS(arr, curr + arr[curr], visited) || DFS(arr, curr-arr[curr], visited);
        }
    }
}
