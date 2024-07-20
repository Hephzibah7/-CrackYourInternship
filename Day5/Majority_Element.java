package Day5;

import java.util.Arrays;

public class Majority_Element {
     public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n/2];
    }
}
