class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            int lastDigitSum=0;
            while(n>0){
                lastDigitSum +=n%10;
                n=n/10;
            }
            if(lastDigitSum < min){
                min = lastDigitSum;
            }
        }
        return min;
    }
}