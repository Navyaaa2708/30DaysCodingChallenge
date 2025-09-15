import java.util.*;

class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (edges.length != n - 1) return false;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        dfs(graph, visited, 0);
        for (boolean v : visited) if (!v) return false;
        return true;
    }

    private void dfs(List<List<Integer>> graph, boolean[] visited, int node) {
        visited[node] = true;
        for (int adj : graph.get(node)) {
            if (!visited[adj]) dfs(graph, visited, adj);
        }
    }
}
