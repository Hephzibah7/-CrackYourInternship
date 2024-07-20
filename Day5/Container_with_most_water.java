package Day5;

public class Container_with_most_water {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int area=0;
        int max=0;
        while(left<right){
             area=(right-left)*Math.min(height[left], height[right]);
             max=Math.max(area, max);
             if(height[left]>=height[right])
             right--;
             else
             left++;
        }
        return max;
 
     }
}
