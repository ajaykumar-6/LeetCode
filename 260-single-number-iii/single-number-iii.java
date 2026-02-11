class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int num : nums){
            h.put(num,h.getOrDefault(num,0)+1);
        }
        int[] res = new int[2];
        int i = 0;
        for(int key : h.keySet()){
            int val = h.get(key);
            if(val == 1){
                res[i++] = key;
                if(i == 2) break;
            }
        }
        return res;
    }
}