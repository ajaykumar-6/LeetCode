class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int num : nums) h.put(num,h.getOrDefault(num,0)+1);
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(h.entrySet());
        list.sort((a,b) -> {
            int c1 = a.getValue();
            int c2 = b.getValue();
            if(c1 != c2) return c1 - c2; 
            return b.getKey() - a.getKey();
        });
        int[] res = new int[nums.length];
        int j = 0;
        for(Map.Entry<Integer,Integer> e : list){
            int key = e.getKey();
            int freq = e.getValue();
            for(int i=0;i<freq && j<nums.length;i++){
                res[j] = key;
                j++;
            }
        }
        return res;
    }
}