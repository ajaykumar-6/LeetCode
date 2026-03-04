class Solution {
    public boolean isPrime(int num){
        if(num < 2) return false;
        for(int i=2;i*i<=num;i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int res = 0;
        for(int i=0;i<n;i++){
            int p = nums[i][i];
            int s = nums[i][n-i-1];
            if(isPrime(p)) res = Math.max(res,p);
            if(isPrime(s)) res = Math.max(res,s);
        }
        return res;
    }
}