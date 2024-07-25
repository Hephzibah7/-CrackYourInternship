package Day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class All_Unique_Permutations_of_an_array {
    static void work(ArrayList<Integer> arr, int n, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> temp, int[] vis){
        if(temp.size()==n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0; i<n; i++){
            if(vis[i]==0 && i>0 && (arr.get(i)==arr.get(i-1)) && (vis[i-1]==0)){
                continue;
            }
            if(vis[i]==0){
                vis[i]=1;
                temp.add(arr.get(i));
                work(arr, n, ans, temp, vis);
                vis[i]=0;
                temp.remove(temp.size()-1);
            }
        }
    }
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        int[] vis=new int[n];
        Arrays.fill(vis, 0);
        work(arr, n, ans, temp, vis);
        return ans;
        }
}
