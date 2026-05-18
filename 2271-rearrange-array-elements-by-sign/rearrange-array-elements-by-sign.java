class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int i=0,j=0;
        for(int num : nums){
            if(num < 0) {
                neg[i++] = num;
            }else{
                pos[j++] = num;
            }
        }
        for(int k=0;k<nums.length/2;k++){
            nums[2*k] = pos[k];
            nums[2*k+1] = neg[k];
        }
        return nums;
    }
}