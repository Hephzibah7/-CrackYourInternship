package Day7;

import java.util.ArrayList;
import java.util.List;

public class Find_all_duplicates_in_an_array {
     public List<Integer> findDuplicates(int[] nums) {
      List<Integer> res=new ArrayList<>();
      for(int i=0; i<nums.length; i++){
        if(nums[Math.abs(nums[i])-1]<0)
             res.add(Math.abs(nums[i]));
        else
        nums[Math.abs(nums[i])-1]=nums[Math.abs(nums[i])-1]*-1;
      } 
      return res; 
    }
}
