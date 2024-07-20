package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum {
      public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
       int j=0;
       int k=nums.length-1;
       int total=0;
       List<List<Integer>> res=new ArrayList<>();
       for(int i=0; i<nums.length; i++){
        if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
        j=i+1;
        k=nums.length - 1;
        while(j<k){
            total = nums[i]+nums[j]+nums[k];
        if(total==0)
        {
            ArrayList<Integer> list=new ArrayList<Integer>();
            list.add(nums[i]);
            list.add(nums[j]);
            list.add(nums[k]);
            res.add(list);
            j++;
            while(nums[j-1]==nums[j] && j<k){
                j++;
            }
        }
        else
        if(total<0)
        j++;
        else
        k--;
       }
       }
       return res;
    }
}
