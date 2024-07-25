package Day9;

import java.util.ArrayList;

public class Detect_a_cycle_in_a_directed_graph {
     boolean dfs(int  i, int V, ArrayList<ArrayList<Integer>> adj, int[] vis, int[] pathvis){
        vis[i]=1;
        pathvis[i]=1;
        for(int it: adj.get(i)){
                if(vis[it]==0){
                    if(dfs(it, V, adj, vis, pathvis)==true) return true;
                }
                else
                if(pathvis[it]==1) return true;
        }
        pathvis[i]=0;
        return false;
        
    }
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int vis[]=new int[V];
        int pathvis[]=new int[V];
        for(int i=0; i<V; i++){
            if(vis[i]==0){
                if(dfs(i, V, adj, vis, pathvis)==true) return true;
            }
        }
        return false;
    }
}
