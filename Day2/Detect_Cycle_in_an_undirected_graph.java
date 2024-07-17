import java.util.*;
class Pair{
    int first, second;
    Pair(int first, int second){
        this.first= first;
        this.second=second;
    }
}
class Solution {
    // Function to detect cycle in an undirected graph.
    boolean detect(int V, ArrayList<ArrayList<Integer>> adj, int[] vis, int start ){
         Queue<Pair> q=new LinkedList<>();
        vis[start]=1;
        q.add(new Pair(start,-1));
        while(!q.isEmpty()){
            int node=q.peek().first;
            int parent=q.peek().second;
            q.remove();
            for(int it: adj.get(node)){
                if(vis[it]==0){
                    vis[it]=1;
                    q.add(new Pair(it, node));
                }
                else
                if(parent!=it){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
       
        int[] vis=new int[V];
        Arrays.fill(vis,0);
        
        for(int i=0; i<V; i++){
            if(vis[i]==0){
                if(detect(V, adj, vis, i)==true)
                return true;
            }
        }
        return false;
    }
}
