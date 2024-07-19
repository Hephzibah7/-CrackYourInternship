package Day4;

import java.util.ArrayList;

public class Move_Zeroes {
     public void moveZeroes(int[] nums) {
        ArrayList <Integer> res=new ArrayList <>();
         ArrayList <Integer> val=new ArrayList <>();
         int a[]=new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]!=0)
            res.add(nums[i]);
            else
            val.add(nums[i]);
        }
        for(int i=0; i<res.size(); i++)
        {
            a[i]=res.get(i);
        }
        int j=0;
        for(int i=res.size(); i<nums.length; i++)
        {
            a[i]=val.get(j);
            j++;
        }
        for(int i=0; i<a.length; i++)
        {
            nums[i]=a[i];
        }
    }
}
