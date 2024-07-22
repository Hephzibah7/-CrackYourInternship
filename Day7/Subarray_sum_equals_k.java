package Day7;

import java.util.HashMap;

public class Subarray_sum_equals_k {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(sum==k) count++;
            int rem= sum - k;
            
            if(map.containsKey(rem)) {

                count= count + map.get(rem);

            }
            
            map.put(sum,map.getOrDefault(sum,0)+1);
            
                
            
        }
        return count;
    }
}
