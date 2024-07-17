class Solution {
    public int maxProduct(int[] nums) {
        double prefix=1;
        double suffix=1;
        double max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
            prefix = prefix * nums[i];
            suffix = suffix * nums[n-i-1];
            max=Math.max(max, Math.max(prefix, suffix));
            System.out.println(max);
        }
        return (int)max;
    }
}