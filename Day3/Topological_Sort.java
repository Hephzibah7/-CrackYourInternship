package Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Topological_Sort {
    static Stack<Integer> stack=new Stack<>();
    //Function to return list containing vertices in Topological order. 
    static void dfs(int node, int V, ArrayList<ArrayList<Integer>> adj, int[] vis){
        vis[node]=1;
        for(int it: adj.get(node)){
            if(vis[it]==0){
                dfs(it, V, adj, vis);
            }
        }
        stack.push(node);
    }
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int[] vis=new int[V];
        int[] ans=new int[V];
        Arrays.fill(vis,0);
        for(int i=0; i<V; i++){
            if(vis[i]==0)
                dfs(i,V, adj, vis);
        }
        int i=0;
        while(!stack.isEmpty()){
            int val=stack.pop();
            ans[i]=val;
            i++;
        }
        return ans;
    }
}
