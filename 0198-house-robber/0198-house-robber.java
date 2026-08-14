class Solution {
    public int rob(int[] nums) {
        // int prevsum1=0;
        // int prevsum2=0;
        // for(int i=0;i<nums.length;i++){
        //     int curr= Math.max(prevsum1,prevsum2+nums[i]);
        //     prevsum2=prevsum1;
        //     prevsum1=curr;
        // }

        // return prevsum1;

        int n = nums.length;
        if( nums==null || n==0)
            return 0;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);

        int df[]=new int[n];
         df[0]=nums[0];
         df[1]=Integer.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            df[i]=Integer.max(nums[i]+df[i-2],df[i-1]);

        }
        return df[n-1];
    }
}