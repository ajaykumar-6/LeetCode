class Solution {
    static int ele;
    public int majorityElement(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(count == 0){
                count = 1;
                ele = nums[i];
            }else if(ele == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        int fcount = 0;
        for(int num : nums){
            if(ele == num) fcount++;
        }
        return (fcount > nums.length/2)? ele : -1;
    }
}