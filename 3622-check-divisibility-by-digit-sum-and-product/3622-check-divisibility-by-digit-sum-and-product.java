class Solution {
    public boolean checkDivisibility(int n) {
        int orgDigit=n;
        int sum=0;
        int product=1;
        
        while(n>0){
            int num=n % 10;
            sum+=num;
            product*=num;
             n=n/10;  
        }

         int total = sum + product;

        return orgDigit % total == 0;

    }
}
