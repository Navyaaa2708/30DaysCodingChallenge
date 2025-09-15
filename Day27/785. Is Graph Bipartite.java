class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color, -1);
        for (int i = 0; i < n; i++) {
            if (color[i] == -1 && !dfs(graph, color, i, 0)) return false;
        }
        return true;
    }

    private boolean dfs(int[][] graph, int[] color, int node, int c) {
        color[node] = c;
        for (int adj : graph[node]) {
            if (color[adj] == -1) {
                if (!dfs(graph, color, adj, 1 - c)) return false;
            } else if (color[adj] == c) return false;
        }
        return true;
    }
}
