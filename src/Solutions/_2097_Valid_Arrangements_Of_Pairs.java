package Solutions;

import java.util.*;

public class _2097_Valid_Arrangements_Of_Pairs {

    List<Integer> circuit;
    public int[][] validArrangement(int[][] pairs) {
        Map<Integer, List<Integer>> graph  = new HashMap<>();
        Map<Integer, Integer> node = new HashMap<>();

        for(int[] pair : pairs) {
            if(!graph.containsKey(pair[0])) {
                graph.put(pair[0], new ArrayList<>());
            }
            graph.get(pair[0]).add(pair[1]);
            node.put(pair[0], node.getOrDefault(pair[0], 0)-1);
            node.put(pair[1], node.getOrDefault(pair[1], 0)+1);
        }

        int startNode = pairs[0][0];
        for(Map.Entry<Integer, Integer> entry : node.entrySet()) {
            if(entry.getValue() == -1) {
                startNode = entry.getKey();
                break;
            }
        }

        circuit = new ArrayList<>();
        dfs(graph, startNode);
        Collections.reverse(circuit);

        int[][] result = new int[pairs.length][2];
        for(int i=1;i<circuit.size();i++) {
            result[i-1][0] = circuit.get(i-1);
            result[i-1][1] = circuit.get(i);
        }

        return result;
    }

    private void dfs(Map<Integer, List<Integer>> graph, int u) {
        while(graph.containsKey(u) && !graph.get(u).isEmpty()) {
            int v = graph.get(u).remove(0);
            dfs(graph, v);
        }
        circuit.add(u);
    }
}
