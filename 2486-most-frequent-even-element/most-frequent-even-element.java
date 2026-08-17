class Solution {
    public int mostFrequentEven(int[] nums) {
        int res = -1;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int num : nums){
            if(num%2 == 0) h.put(num,h.getOrDefault(num,0)+1);
        }
        int CurrentFreq = 0;
        for(int key : h.keySet()){
            int freq = h.get(key);
            if(freq > CurrentFreq){
                CurrentFreq = freq;
                res = key;
            }else if(freq == CurrentFreq){
                if(key < res) res = key;
            }
        }
        return res;
    }
}