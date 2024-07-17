import java.util.*;
public class dfs_graph {
    class Solution {
        // Function to return a list containing the DFS traversal of the graph.
        ArrayList<Integer> res=new ArrayList<>();
        void dfs(int V, ArrayList<ArrayList<Integer>> adj, boolean vis[], int node){
            vis[node]=true;
            res.add(node);
            for(Integer it:adj.get(node)){
                if(vis[it]==false)
                dfs(V,adj,vis,it);
            }
        }
        public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
            // Code here
            boolean vis[]=new boolean[V+1];
            int node=0;
            dfs(V,adj,vis,node);
            return res;
            
        }
    }
}
