package Day4;

public class Sort_Colors {
    public void sortColors(int[] nums) {
        int l=0; 
        int r=nums.length-1;
        for(int i=0; i<=r;){
            if(nums[i]==0)
              {
                  swap(nums, i, l);
                  i++;
                  l++;
              }
              else
              if(nums[i]==1)
              i++;
              else{
                  swap(nums, i, r);
                  r--;
              }
        }
      }
              void swap(int[] nums, int i, int j){
                  int temp=0;
                  temp=nums[i];
                  nums[i]=nums[j];
                  nums[j]=temp;
              }
        
}
