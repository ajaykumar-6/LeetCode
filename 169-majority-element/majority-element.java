class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h =  new HashMap<>();
        for(int num : nums){
            h.put(num,h.getOrDefault(num,0)+1);
        }
        int x = nums.length/2;
        for(int num : h.keySet()){
            if(h.get(num) > x){
                return num;
            }
        }
        return -1;
    }
}