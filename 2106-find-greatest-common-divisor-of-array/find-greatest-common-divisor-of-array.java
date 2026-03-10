class Solution {
    public int gcd(int n1,int n2){
        while(n1 != n2){
            if(n1 > n2) n1 = n1 - n2;
            if(n2 > n1) n2 = n2 - n1;
        }
        return n1;
    }
    public int findGCD(int[] nums) {
        int n1 = Integer.MAX_VALUE;
        int n2 = Integer.MIN_VALUE;
        for(int num : nums){
            if(num < n1) n1 = num;
            if(num > n2) n2 = num;
        }
        return gcd(n1,n2);
    }
}