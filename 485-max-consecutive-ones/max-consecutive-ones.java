class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int temp = 0;
        for(int num : nums){
            if(num == 1) temp += 1;
            else temp = 0;
            res = Math.max(res,temp);
        }
        return res;
    }
}