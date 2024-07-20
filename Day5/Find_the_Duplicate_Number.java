package Day5;

public class Find_the_Duplicate_Number {
    public int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        do{
          slow=nums[slow];
          fast=nums[nums[fast]]; 
        } while(slow != fast);
        slow=nums[0];
        while(slow!=fast){
          slow=nums[slow];
          fast=nums[fast];
        }
        return slow;
      }
}
