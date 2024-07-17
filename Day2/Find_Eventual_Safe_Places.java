import java.util.*;
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
       List<List<Integer>> adjrev = new ArrayList<>();
       int V=graph.length;
       for(int i=0; i<V; i++){
        adjrev.add(new ArrayList<>());
       } 
       int indegrees[] = new int[V];
       Arrays.fill(indegrees, 0);
       for(int i=0; i<V; i++){
        for(int it: graph[i]){
            adjrev.get(it).add(i);
            indegrees[i]++;
        }
       }
       Queue<Integer> q=new LinkedList<>();
       List<Integer> safenodes=new ArrayList<>();
       for(int i=0; i<V; i++){
        if(indegrees[i]==0) q.add(i);
       }
       while(!q.isEmpty()){
        int node=q.peek();
        q.remove();
        safenodes.add(node);
        for(int it: adjrev.get(node)){
            indegrees[it]--;
            if(indegrees[it]==0) q.add(it);
        }

       }
       Collections.sort(safenodes);
       return safenodes;

    }
}