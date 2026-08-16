class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int num : nums) h.put(num,h.getOrDefault(num,0)+1);
        int req = nums.length/2;
        for(int key : h.keySet()){
            if(h.get(key) > req){
                return key;
            }
        }
        return 0;
    }
}