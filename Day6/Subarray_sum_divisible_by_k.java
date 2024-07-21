import java.util.HashMap;

public class Subarray_sum_divisible_by_k {
       public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        for(int i=0; i<nums.length; i++){
           
            sum += nums[i];
            if(sum%k==0) count++;
            int rem=sum%k;
             // Adjust negative remainders to be positive
            if (rem < 0) {
                rem += k;
            }
            if(map.containsKey(rem)){
                count += map.get(rem);
                map.put(rem, map.get(rem)+1);
            }
            if(!map.containsKey(rem)) map.put(rem, 1);
            
        }
        return count;
    }
}
