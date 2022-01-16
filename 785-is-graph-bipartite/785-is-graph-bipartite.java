class Solution {
    public boolean isBipartite(int[][] graph) {
        int length = graph.length;
        int color[] = new int[length];
        for(int i = 0;i < length;i++) {
            color[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i =0;i < length;i++) {
       color[0] = 1;
        q.add(i);
            while(!q.isEmpty()) {
                int cur = q.poll();
                for(int it : graph[cur]) {
                    if(color[it] == -1) {
                        color[it] = 1 - color[cur];
                    } else if(color[it] == color[cur]) {
                        return false;
                    }
                }
            }
            }
        return true;
        
    }
}